package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.ManaColor;
import com.odiy.domain.mapper.j99.model.ManaColorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ManaColorMapper {
    long countByExample(ManaColorExample example);

    int deleteByExample(ManaColorExample example);

    int deleteByPrimaryKey(@Param("tempId") Integer tempId, @Param("id") Integer id, @Param("shopId") Integer shopId);

    int insert(ManaColor record);

    int insertSelective(ManaColor record);

    List<ManaColor> selectByExample(ManaColorExample example);

    ManaColor selectByPrimaryKey(@Param("tempId") Integer tempId, @Param("id") Integer id, @Param("shopId") Integer shopId);

    int updateByExampleSelective(@Param("record") ManaColor record, @Param("example") ManaColorExample example);

    int updateByExample(@Param("record") ManaColor record, @Param("example") ManaColorExample example);

    int updateByPrimaryKeySelective(ManaColor record);

    int updateByPrimaryKey(ManaColor record);
}