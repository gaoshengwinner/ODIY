package com.odiy.domain.mapper.j99.mapper;

import com.odiy.domain.mapper.j99.model.MemberBaseInfo;
import com.odiy.domain.mapper.j99.model.MemberBaseInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface MemberBaseInfoMapper {
    long countByExample(MemberBaseInfoExample example);

    int deleteByExample(MemberBaseInfoExample example);

    int deleteByPrimaryKey(Integer memberId);

    int insert(MemberBaseInfo record);

    int insertSelective(MemberBaseInfo record);

    List<MemberBaseInfo> selectByExample(MemberBaseInfoExample example);

    MemberBaseInfo selectByPrimaryKey(Integer memberId);

    int updateByExampleSelective(@Param("record") MemberBaseInfo record, @Param("example") MemberBaseInfoExample example);

    int updateByExample(@Param("record") MemberBaseInfo record, @Param("example") MemberBaseInfoExample example);

    int updateByPrimaryKeySelective(MemberBaseInfo record);

    int updateByPrimaryKey(MemberBaseInfo record);
}