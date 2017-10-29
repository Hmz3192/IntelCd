package cn.zjnu.hmz.dao;

import cn.zjnu.hmz.model.DoorRecord;
import cn.zjnu.hmz.model.DoorRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DoorRecordMapper {
    int countByExample(DoorRecordExample example);

    int deleteByExample(DoorRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DoorRecord record);

    int insertSelective(DoorRecord record);

    List<DoorRecord> selectByExample(DoorRecordExample example);

    DoorRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DoorRecord record, @Param("example") DoorRecordExample example);

    int updateByExample(@Param("record") DoorRecord record, @Param("example") DoorRecordExample example);

    int updateByPrimaryKeySelective(DoorRecord record);

    int updateByPrimaryKey(DoorRecord record);
}