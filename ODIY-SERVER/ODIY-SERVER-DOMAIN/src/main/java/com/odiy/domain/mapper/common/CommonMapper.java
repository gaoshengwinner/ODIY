package com.odiy.domain.mapper.common;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

@Mapper
public interface CommonMapper {
	
	@Select("SELECT LAST_INSERT_ID()")
	Long getLastInsertID();
	
	@Select("SELECT MAX(id) FROM TC050_MANA_COLOR WHERE TEMP_ID = #{tempId} AND SHOP_ID = TEMP_ID = #{shopId}")
	Integer getMaxManaColorID(Integer tempId, Integer shopId);

}