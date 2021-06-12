package com.odiy.domain.services;

import java.sql.SQLIntegrityConstraintViolationException;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.odiy.domain.common.beans.DeviceInfo;
import com.odiy.domain.common.beans.MemberStaus;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.common.exceptions.UserNotExsitException;
import com.odiy.domain.mapper.j99.mapper.MemberBaseInfoMapper;
import com.odiy.domain.mapper.j99.mapper.UserTokenMapper;
import com.odiy.domain.mapper.j99.model.MemberBaseInfo;
import com.odiy.domain.mapper.j99.model.MemberBaseInfoExample;
import com.odiy.domain.mapper.j99.model.UserToken;
import com.odiy.domain.mapper.j99.model.UserTokenExample;

@Service
public class MemberRegistServiceImpl implements MemberRegistService {
	public static long REFRESHTOKENLIMIT = 182 * 24 * 60 * 60;
	public static long ACCCESSTOKENLIMIT = 30 * 60;

	@Inject
	private PasswordEncoder passwordEncoder;

	@Inject
	private MemberBaseInfoMapper memberBaseInfoMapper;

	@Inject
	private UserTokenMapper userTokenMapper;

	@Override
	public boolean checkMemberMailExist(String mail) {
		MemberBaseInfoExample example = new MemberBaseInfoExample();
		example.createCriteria().andMemberEmailEqualTo(mail.toLowerCase());

		List<MemberBaseInfo> result = memberBaseInfoMapper.selectByExample(example);

		return result == null || result.size() <= 0 ? false : true;
	}

	@Override
	public void resigtMemberByMail(String memberEmail, String memberPassword) {
		try {
			memberBaseInfoMapper.insert(MemberBaseInfo.builder().memberEmail(memberEmail.toLowerCase())
					.memberStaus(MemberStaus.OK.getValue()).memberPassword(passwordEncoder.encode(memberPassword))
					.build());
		} catch (Exception e) {
			if (e instanceof SQLIntegrityConstraintViolationException) {
			} else {
				throw e;
			}
		}
	}

	@Override
	public void restPasswordByMail(String memberEmail, String memberPassword) {

		final MemberBaseInfoExample example = new MemberBaseInfoExample();
		example.createCriteria().andMemberEmailEqualTo(memberEmail.toLowerCase());
		List<MemberBaseInfo> result = memberBaseInfoMapper.selectByExample(example);
		if (result == null || result.size() == 0) {
			return;
		}
		final MemberBaseInfo memberBaseInfo = result.get(0);
		memberBaseInfo.setMemberPassword(passwordEncoder.encode(memberPassword));

		memberBaseInfoMapper.updateByExample(memberBaseInfo, example);

	}

	@Override
	public UserToken loginForApi(String memberEmail, String memberPassword, DeviceInfo di)
			throws UserNotExsitException, AuthotionException {
		final MemberBaseInfoExample example = new MemberBaseInfoExample();
		example.createCriteria().andMemberEmailEqualTo(memberEmail).andMemberStausEqualTo("0");
		final List<MemberBaseInfo> result = memberBaseInfoMapper.selectByExample(example);
		if (result == null || result.size() < 1) {
			throw new UserNotExsitException("該当メールアドレス未登録");
		}

		if (!passwordEncoder.matches(memberPassword, result.get(0).getMemberPassword())) {
			throw new AuthotionException("パースワード不正");
		}

		final UserToken userToken = UserToken.builder().memberId(result.get(0).getMemberId())
				.accessToken(UUID.randomUUID().toString()).deviceId(di.getDeviceId())
				.accessTokenLimit(LocalDateTime.now().plusSeconds(ACCCESSTOKENLIMIT)) // TODO
				.refreshToken(UUID.randomUUID().toString())
				.refreshTokenLimit(LocalDateTime.now().plusSeconds(REFRESHTOKENLIMIT)) // TODO
				.build();

		UserTokenExample userTokenExample = new UserTokenExample();
		userTokenExample.createCriteria().andDeviceIdEqualTo(di.getDeviceId());
		userTokenMapper.deleteByExample(userTokenExample);
		userTokenMapper.deleteByPrimaryKey(userToken.getMemberId());
		userTokenMapper.insert(userToken);

		return userToken;

	}

	@Override
	public UserToken refreshToken(String refreshToken) throws AuthotionException {
		// 存在チェック
		UserTokenExample example = new UserTokenExample();
		example.createCriteria().andRefreshTokenEqualTo(refreshToken);
		List<UserToken> list = userTokenMapper.selectByExample(example);

		if (list == null || list.size() <= 0) {
			throw new AuthotionException("トークン不正");
		}
		UserToken ut = list.get(0);
		if (ut.getRefreshTokenLimit().isBefore(LocalDateTime.now())) {
			throw new AuthotionException("トークン期限切れ");
		}

		ut.setAccessToken(UUID.randomUUID().toString());
		ut.setAccessTokenLimit(LocalDateTime.now().plusSeconds(ACCCESSTOKENLIMIT));

		userTokenMapper.updateByPrimaryKey(ut);
		return ut;

	}

	@Override
	public boolean checkAccessToken(String accessToken) {
		UserTokenExample example = new UserTokenExample();
		example.createCriteria().andAccessTokenEqualTo(accessToken);
		List<UserToken> list = userTokenMapper.selectByExample(example);
		return list != null && list.size() > 0 && list.get(0).getRefreshTokenLimit().isAfter(LocalDateTime.now());
	}

	@Override
	public UserToken getchUserTokenByAccessToken(String accessToken) {
		UserTokenExample example = new UserTokenExample();
		example.createCriteria().andAccessTokenEqualTo(accessToken);
		List<UserToken> list = userTokenMapper.selectByExample(example);
		if (list != null && list.size() > 0) {
			return list.get(0);
		}
		return null;
	}

}
