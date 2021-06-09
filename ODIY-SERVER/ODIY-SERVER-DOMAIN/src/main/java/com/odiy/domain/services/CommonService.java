package com.odiy.domain.services;

import com.odiy.domain.mapper.common.TempInfoType;

public interface CommonService {

	void saveTempInfo(TempInfoType type, String uuid, String value);

	boolean checkTempInfoValue(TempInfoType type, String uuid, String value);

}
