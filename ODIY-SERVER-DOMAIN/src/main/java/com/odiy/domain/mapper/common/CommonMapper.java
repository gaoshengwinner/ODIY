package com.odiy.domain.mapper.common;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommonMapper {
	
	@Select("SELECT LAST_INSERT_ID()")
	Long getLastInsertID();

}
