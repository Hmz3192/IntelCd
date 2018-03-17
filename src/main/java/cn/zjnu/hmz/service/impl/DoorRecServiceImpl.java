package cn.zjnu.hmz.service.impl;

import cn.zjnu.hmz.dao.DoorRecordMapper;
import cn.zjnu.hmz.model.DoorRecord;
import cn.zjnu.hmz.model.DoorRecordExample;
import cn.zjnu.hmz.service.DoorRecService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2018/3/6.
 */
@Service
public class DoorRecServiceImpl implements DoorRecService {


    @Resource
    private DoorRecordMapper doorRecordMapper;

    public void addOneRec(DoorRecord doorRecord) {
        doorRecordMapper.insertSelective(doorRecord);
    }
}
