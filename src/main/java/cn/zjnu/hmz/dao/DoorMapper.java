package cn.zjnu.hmz.dao;

import cn.zjnu.hmz.model.Door;
import cn.zjnu.hmz.model.DoorExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorMapper {
    int countByExample(DoorExample example);

    int deleteByExample(DoorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Door record);

    int insertSelective(Door record);

    List<Door> selectByExample(DoorExample example);

    Door selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Door record, @Param("example") DoorExample example);

    int updateByExample(@Param("record") Door record, @Param("example") DoorExample example);

    int updateByPrimaryKeySelective(Door record);

    int updateByPrimaryKey(Door record);
}