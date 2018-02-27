package cn.zjnu.hmz.dao;

import cn.zjnu.hmz.model.GroupInfo;
import cn.zjnu.hmz.model.GroupInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface GroupInfoMapper {
    int countByExample(GroupInfoExample example);

    int deleteByExample(GroupInfoExample example);

    int deleteByPrimaryKey(Integer groupid);

    int insert(GroupInfo record);

    int insertSelective(GroupInfo record);

    List<GroupInfo> selectByExample(GroupInfoExample example);

    GroupInfo selectByPrimaryKey(Integer groupid);

    int updateByExampleSelective(@Param("record") GroupInfo record, @Param("example") GroupInfoExample example);

    int updateByExample(@Param("record") GroupInfo record, @Param("example") GroupInfoExample example);

    int updateByPrimaryKeySelective(GroupInfo record);

    int updateByPrimaryKey(GroupInfo record);
}