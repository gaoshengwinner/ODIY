package com.odiy.domain.services;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.odiy.domain.mapper.common.TempInfoType;
import com.odiy.domain.mapper.j99.mapper.TempInfoMapper;
import com.odiy.domain.mapper.j99.model.TempInfo;
import com.odiy.domain.mapper.j99.model.TempInfoExample;

@Service
public class CommonServiceImpl implements CommonService {
	@Inject
	private TempInfoMapper tempInfoMapper;

	@Override
	public void saveTempInfo(TempInfoType type, String uuid, String value) {
		final TempInfo tempInfo = TempInfo.builder().date(LocalDate.now()).uuid(uuid).value(value)
				.canErrTimes(type.getCanErrTimes()).nowErrTimes(0)
				.validDatetime(LocalDateTime.now().plusSeconds(type.getValidSec())).type(type.getValue()).build();
		tempInfoMapper.insert(tempInfo);
	}

	@Override
	public boolean checkTempInfoValue(TempInfoType type, String uuid, String value) {
		final TempInfoExample example = new TempInfoExample();
		example.createCriteria().andUuidEqualTo(uuid);
		List<TempInfo> list = tempInfoMapper.selectByExample(example);
		if (list == null || list.size() == 0) {
			return false;
		}
		final TempInfo tempInfo = list.get(0);

		if (tempInfo.getCanErrTimes() != null && tempInfo.getNowErrTimes() >= tempInfo.getCanErrTimes()) {
			return false;
		}

		final boolean result = (tempInfo.getValidDatetime().isAfter(LocalDateTime.now())
				&& getNotNull(tempInfo.getValue()).equals(getNotNull(value)));
		
		if (!result && tempInfo.getCanErrTimes() != null) {
			tempInfo.setNowErrTimes(tempInfo.getNowErrTimes());
			tempInfoMapper.updateByPrimaryKey(tempInfo);
		}
		
		return result;
	}

	public static String getNotNull(String s) {
		return s == null ? "" : s;
	}
}
