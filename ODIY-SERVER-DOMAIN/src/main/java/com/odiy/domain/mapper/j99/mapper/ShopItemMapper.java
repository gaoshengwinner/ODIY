package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.ShopItem;
import com.odiy.domain.mapper.j99.model.ShopItemExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface ShopItemMapper {
    long countByExample(ShopItemExample example);

    int deleteByExample(ShopItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ShopItem record);

    int insertSelective(ShopItem record);

    List<ShopItem> selectByExampleWithBLOBs(ShopItemExample example);

    List<ShopItem> selectByExample(ShopItemExample example);

    ShopItem selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ShopItem record, @Param("example") ShopItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ShopItem record, @Param("example") ShopItemExample example);

    int updateByExample(@Param("record") ShopItem record, @Param("example") ShopItemExample example);

    int updateByPrimaryKeySelective(ShopItem record);

    int updateByPrimaryKeyWithBLOBs(ShopItem record);

    int updateByPrimaryKey(ShopItem record);
}