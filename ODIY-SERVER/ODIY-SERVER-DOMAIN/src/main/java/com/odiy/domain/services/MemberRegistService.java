package com.odiy.domain.services;

import com.odiy.domain.common.beans.DeviceInfo;
import com.odiy.domain.common.exceptions.AuthotionException;
import com.odiy.domain.common.exceptions.UserNotExsitException;
import com.odiy.domain.mapper.j99.model.UserToken;

public interface MemberRegistService {

	boolean checkMemberMailExist(String mail);

	void resigtMemberByMail(String memberEmail, String memberPassword);

	UserToken loginForApi(String memberEmail, String memberPassword, DeviceInfo di)
			throws UserNotExsitException, AuthotionException;

	UserToken refreshToken(String refreshToken) throws AuthotionException;

	boolean checkAccessToken(String accessToken);

	UserToken getchUserTokenByAccessToken(String accessToken);

	void restPasswordByMail(String memberEmail, String memberPassword);

}
