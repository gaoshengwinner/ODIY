package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.ShopBaseInfo;
import com.odiy.domain.mapper.j99.model.ShopBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopBaseInfoMapper {
    long countByExample(ShopBaseInfoExample example);

    int deleteByExample(ShopBaseInfoExample example);

    int deleteByPrimaryKey(Integer shopId);

    int insert(ShopBaseInfo record);

    int insertSelective(ShopBaseInfo record);

    List<ShopBaseInfo> selectByExample(ShopBaseInfoExample example);

    ShopBaseInfo selectByPrimaryKey(Integer shopId);

    int updateByExampleSelective(@Param("record") ShopBaseInfo record, @Param("example") ShopBaseInfoExample example);

    int updateByExample(@Param("record") ShopBaseInfo record, @Param("example") ShopBaseInfoExample example);

    int updateByPrimaryKeySelective(ShopBaseInfo record);

    int updateByPrimaryKey(ShopBaseInfo record);
}