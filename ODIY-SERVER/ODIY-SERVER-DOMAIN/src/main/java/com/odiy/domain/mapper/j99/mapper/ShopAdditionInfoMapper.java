package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.ShopAdditionInfo;
import com.odiy.domain.mapper.j99.model.ShopAdditionInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopAdditionInfoMapper {
    long countByExample(ShopAdditionInfoExample example);

    int deleteByExample(ShopAdditionInfoExample example);

    int deleteByPrimaryKey(@Param("shopId") Integer shopId, @Param("ver") Integer ver);

    int insert(ShopAdditionInfo record);

    int insertSelective(ShopAdditionInfo record);

    List<ShopAdditionInfo> selectByExample(ShopAdditionInfoExample example);

    ShopAdditionInfo selectByPrimaryKey(@Param("shopId") Integer shopId, @Param("ver") Integer ver);

    int updateByExampleSelective(@Param("record") ShopAdditionInfo record, @Param("example") ShopAdditionInfoExample example);

    int updateByExample(@Param("record") ShopAdditionInfo record, @Param("example") ShopAdditionInfoExample example);

    int updateByPrimaryKeySelective(ShopAdditionInfo record);

    int updateByPrimaryKey(ShopAdditionInfo record);
}