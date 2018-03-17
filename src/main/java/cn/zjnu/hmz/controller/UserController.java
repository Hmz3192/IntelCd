package cn.zjnu.hmz.controller;

import cn.zjnu.hmz.model.Door;
import cn.zjnu.hmz.model.DoorRecord;
import cn.zjnu.hmz.model.User;
import cn.zjnu.hmz.service.DoorRecService;
import cn.zjnu.hmz.service.DoorService;
import cn.zjnu.hmz.service.UserService;
import cn.zjnu.hmz.utils.JsonUtils;
import cn.zjnu.hmz.utils.Util;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/10/29.
 */
@Controller
public class UserController {

    @Resource
    UserService userService;
    @Resource
    DoorService doorService;
    @Resource
    DoorRecService DoorRecService;
    @RequestMapping(method = RequestMethod.POST, value = "/register")
    @ResponseBody
    public String register(User user) {
        user.setAccount(Util.getSixId());
        user.setPicUrl("http://101.201.234.133:8111/IntelCd/img/2.jpg");
        user.setPassword(String.valueOf(new Md5Hash(user.getPassword(), JsonUtils.readSalt())));
        userService.register(user);
        return user.getAccount();

    }

    @RequestMapping(value = "/index")
    public String index(String hxid) {
        return "font/index";

    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getPic")
    public User getPic(String hxid) {
        return userService.getPic(hxid);

    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getKeyByUser")
    public List<Door> getKeyByUser(String hxid) {
        return doorService.getDoorByUser(hxid);

    }
    @ResponseBody
    @RequestMapping(method = RequestMethod.GET, value = "/getDoorRecord")
    public List<DoorRecord> getDoorRecord(String doorId) {
        return doorService.getDoorRecord(doorId);

    }

    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/addKey")
    public String addKey(String userId, String doorName, String doorLocation, String addTime, String doorKind, String longitude, String dimension) {
        Door newnestId = doorService.getNewnestId();
        Door door = new Door();
        door.setAddTime(addTime);
        door.setDimension(dimension);
        door.setDoorKind("2");
        door.setDoorLocation(doorLocation);
        door.setUserId(Integer.valueOf(userId));
        door.setLongitude(longitude);
        door.setDoorName(doorName);
        door.setDoorId(String.valueOf(Integer.valueOf(newnestId.getDoorId()) + 1));
        door.setDoorState(String.valueOf(0));
        doorService.addOne(door);
        return "OK";

    }


    @ResponseBody
    @RequestMapping(method = RequestMethod.POST, value = "/addRec")
    public String addRec(String userId, String doorId,String kind) {
        DoorRecord doorRecord = new DoorRecord();
        doorRecord.setDoorId(doorId);
        doorRecord.setOpenKind(String.valueOf(2));
        doorRecord.setOpenTime("2018-03-16");
        if (kind.equalsIgnoreCase("1")) {
            doorRecord.setOpenReason("FreeKey--蓝牙--开锁");
        }else if(kind.equalsIgnoreCase("0")) {
            doorRecord.setOpenReason("FreeKey--WIFI--开锁");
        }else if(kind.equalsIgnoreCase("2")) {
            doorRecord.setOpenReason("User: Send");
        }

        doorRecord.setUserId(Integer.valueOf(userId));
        DoorRecService.addOneRec(doorRecord);
        return "OK";

    }
}
