package cn.zjnu.hmz.service;

import cn.zjnu.hmz.model.Door;

import java.util.List;

public interface DoorService {


    List<Door> getDoorByUser(String hxid);
}
