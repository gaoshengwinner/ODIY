package com.odiy.domain.services;

public interface MemberRegistService {

	public boolean checkMemberMailExist(String mail);

	public void resigtMemberByMail(String memberEmail, String memberPassword);
}
