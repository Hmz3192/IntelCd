package cn.zjnu.hmz.service.impl;

import cn.zjnu.hmz.dao.DoorMapper;
import cn.zjnu.hmz.model.Door;
import cn.zjnu.hmz.model.DoorExample;
import cn.zjnu.hmz.service.DoorService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Service
public class DoorServiceImpl implements DoorService {

    @Resource
    DoorMapper doorMapper;

    @Override
    public List<Door> getDoorByUser(String hxid) {
        List<Door> doors = new ArrayList<>();
        DoorExample doorExample = new DoorExample();
        DoorExample.Criteria criteria = doorExample.createCriteria();
        criteria.andUserIdEqualTo(Integer.valueOf(hxid));
        doors = doorMapper.selectByExample(doorExample);
        return doors;
    }
}
