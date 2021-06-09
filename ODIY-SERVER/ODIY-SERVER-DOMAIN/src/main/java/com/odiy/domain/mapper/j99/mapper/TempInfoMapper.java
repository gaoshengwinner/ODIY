package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.TempInfo;
import com.odiy.domain.mapper.j99.model.TempInfoExample;
import java.time.LocalDate;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempInfoMapper {
    long countByExample(TempInfoExample example);

    int deleteByExample(TempInfoExample example);

    int deleteByPrimaryKey(@Param("date") LocalDate date, @Param("uuid") String uuid);

    int insert(TempInfo record);

    int insertSelective(TempInfo record);

    List<TempInfo> selectByExample(TempInfoExample example);

    TempInfo selectByPrimaryKey(@Param("date") LocalDate date, @Param("uuid") String uuid);

    int updateByExampleSelective(@Param("record") TempInfo record, @Param("example") TempInfoExample example);

    int updateByExample(@Param("record") TempInfo record, @Param("example") TempInfoExample example);

    int updateByPrimaryKeySelective(TempInfo record);

    int updateByPrimaryKey(TempInfo record);
}