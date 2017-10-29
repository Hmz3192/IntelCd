package cn.zjnu.hmz.service.impl;

import cn.zjnu.hmz.dao.UserMapper;
import cn.zjnu.hmz.model.User;
import cn.zjnu.hmz.model.UserExample;
import cn.zjnu.hmz.service.UserService;
import cn.zjnu.hmz.utils.JsonUtils;
import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/10/29.
 */
@Service
public class UserServviceImpl implements UserService{

    @Resource
    private UserMapper userMapper;

    @Override
    public void register(User user) {
        userMapper.insertSelective(user);
    }
}
