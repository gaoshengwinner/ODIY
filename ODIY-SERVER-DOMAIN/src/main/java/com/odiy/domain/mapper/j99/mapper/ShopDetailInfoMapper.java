package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.ShopDetailInfo;
import com.odiy.domain.mapper.j99.model.ShopDetailInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopDetailInfoMapper {
    long countByExample(ShopDetailInfoExample example);

    int deleteByExample(ShopDetailInfoExample example);

    int deleteByPrimaryKey(@Param("shopId") Integer shopId, @Param("detailId") Integer detailId);

    int insert(ShopDetailInfo record);

    int insertSelective(ShopDetailInfo record);

    List<ShopDetailInfo> selectByExample(ShopDetailInfoExample example);

    ShopDetailInfo selectByPrimaryKey(@Param("shopId") Integer shopId, @Param("detailId") Integer detailId);

    int updateByExampleSelective(@Param("record") ShopDetailInfo record, @Param("example") ShopDetailInfoExample example);

    int updateByExample(@Param("record") ShopDetailInfo record, @Param("example") ShopDetailInfoExample example);

    int updateByPrimaryKeySelective(ShopDetailInfo record);

    int updateByPrimaryKey(ShopDetailInfo record);
}