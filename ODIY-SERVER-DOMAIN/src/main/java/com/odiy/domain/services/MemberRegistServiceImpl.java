package com.odiy.domain.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.odiy.domain.common.beans.MemberStaus;
import com.odiy.domain.mapper.j99.mapper.MemberBaseInfoMapper;
import com.odiy.domain.mapper.j99.model.MemberBaseInfo;
import com.odiy.domain.mapper.j99.model.MemberBaseInfoExample;

@Service
public class MemberRegistServiceImpl implements MemberRegistService {

	@Inject
	private PasswordEncoder passwordEncoder;

	@Inject
	private MemberBaseInfoMapper memberBaseInfoMapper;

	@Override
	public boolean checkMemberMailExist(String mail) {
		MemberBaseInfoExample example = new MemberBaseInfoExample();
		example.createCriteria().andMemberEmailEqualTo(mail);
		List<MemberBaseInfo> result = memberBaseInfoMapper.selectByExample(example);

		return result == null || result.size() <= 0 ? false : true;
	}

	@Override
	public void resigtMemberByMail(String memberEmail, String memberPassword) {
		memberBaseInfoMapper.insert(MemberBaseInfo.builder().memberEmail(memberEmail)
				.memberStaus(MemberStaus.OK.getValue()).memberPassword(passwordEncoder.encode(memberPassword)).build());
	}
	
}
