package cn.zjnu.hmz.service;

import cn.zjnu.hmz.model.User;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/10/29.
 */
public interface UserService {

    void register(User user);


    User getPic(String hxid);
}
