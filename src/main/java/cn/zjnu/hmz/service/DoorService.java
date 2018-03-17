package cn.zjnu.hmz.service;

import cn.zjnu.hmz.model.Door;
import cn.zjnu.hmz.model.DoorRecord;

import java.util.List;

public interface DoorService {
    List<Door> getDoorByUser(String hxid);

    List<DoorRecord> getDoorRecord(String doorId);

    Door getNewnestId();

    int addOne(Door door);
}
