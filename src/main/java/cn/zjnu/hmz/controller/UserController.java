package cn.zjnu.hmz.controller;

import cn.zjnu.hmz.model.User;
import cn.zjnu.hmz.service.UserService;
import cn.zjnu.hmz.utils.JsonUtils;
import cn.zjnu.hmz.utils.Util;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/10/29.
 */
@Controller
@ResponseBody
public class UserController {

    @Resource
    UserService userService;

    @RequestMapping(method = RequestMethod.POST, value = "/register")
    public String register(User user) {
        user.setAccount(Util.getSixId());
        user.setPassword(String.valueOf(new Md5Hash(user.getPassword(), JsonUtils.readSalt())));
        userService.register(user);
        return user.getAccount();

    }
}