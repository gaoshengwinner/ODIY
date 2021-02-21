package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.OptionTemp;
import com.odiy.domain.mapper.j99.model.OptionTempExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface OptionTempMapper {
    long countByExample(OptionTempExample example);

    int deleteByExample(OptionTempExample example);

    int deleteByPrimaryKey(@Param("id") Integer id, @Param("shopId") Integer shopId);

    int insert(OptionTemp record);

    int insertSelective(OptionTemp record);

    List<OptionTemp> selectByExample(OptionTempExample example);

    OptionTemp selectByPrimaryKey(@Param("id") Integer id, @Param("shopId") Integer shopId);

    int updateByExampleSelective(@Param("record") OptionTemp record, @Param("example") OptionTempExample example);

    int updateByExample(@Param("record") OptionTemp record, @Param("example") OptionTempExample example);

    int updateByPrimaryKeySelective(OptionTemp record);

    int updateByPrimaryKey(OptionTemp record);
}