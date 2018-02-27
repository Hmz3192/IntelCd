package cn.zjnu.hmz.dao;

import cn.zjnu.hmz.model.InvationInfo;
import cn.zjnu.hmz.model.InvationInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface InvationInfoMapper {
    int countByExample(InvationInfoExample example);

    int deleteByExample(InvationInfoExample example);

    int deleteByPrimaryKey(Integer userId);

    int insert(InvationInfo record);

    int insertSelective(InvationInfo record);

    List<InvationInfo> selectByExample(InvationInfoExample example);

    InvationInfo selectByPrimaryKey(Integer userId);

    int updateByExampleSelective(@Param("record") InvationInfo record, @Param("example") InvationInfoExample example);

    int updateByExample(@Param("record") InvationInfo record, @Param("example") InvationInfoExample example);

    int updateByPrimaryKeySelective(InvationInfo record);

    int updateByPrimaryKey(InvationInfo record);
}