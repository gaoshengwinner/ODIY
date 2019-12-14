package com.odiy.domain.common.beans;

import java.util.ArrayList;

import org.springframework.security.core.userdetails.User;

import com.odiy.domain.mapper.j99.model.MemberBaseInfo;

public class LoginingMemberInfo extends User {

	private static final long serialVersionUID = 6870012045255992287L;

	MemberBaseInfo memberBaseInfo;

	public LoginingMemberInfo(MemberBaseInfo memberBaseInfo) {
		super(memberBaseInfo.getMemberEmail(), memberBaseInfo.getMemberPassword(), new ArrayList<>());
		this.memberBaseInfo = memberBaseInfo;
	}

}
