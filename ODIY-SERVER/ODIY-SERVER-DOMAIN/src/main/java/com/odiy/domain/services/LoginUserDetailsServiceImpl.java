package com.odiy.domain.services;

import java.util.List;

import javax.inject.Inject;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.odiy.domain.common.beans.LoginingMemberInfo;
import com.odiy.domain.mapper.j99.mapper.MemberBaseInfoMapper;
import com.odiy.domain.mapper.j99.model.MemberBaseInfo;
import com.odiy.domain.mapper.j99.model.MemberBaseInfoExample;

@Service
public class LoginUserDetailsServiceImpl implements UserDetailsService {
	@Inject
	private MemberBaseInfoMapper memberBaseInfoMapper;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

		MemberBaseInfoExample example = new MemberBaseInfoExample();
		example.createCriteria().andMemberEmailEqualTo(username);
		List<MemberBaseInfo> result = memberBaseInfoMapper.selectByExample(example);
		if (result == null || result.size() <= 0) {
			throw new UsernameNotFoundException(username);
		}

		return new LoginingMemberInfo(result.get(0));
	}
}
