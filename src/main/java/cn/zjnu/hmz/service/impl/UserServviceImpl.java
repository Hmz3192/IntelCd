package cn.zjnu.hmz.service.impl;

import cn.zjnu.hmz.dao.UserMapper;
import cn.zjnu.hmz.model.User;
import cn.zjnu.hmz.model.UserExample;
import cn.zjnu.hmz.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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

    @Override
    public User getPic(String hxid) {
        User user;
        UserExample userExample = new UserExample();
        UserExample.Criteria criteria = userExample.createCriteria();
        criteria.andAccountEqualTo(hxid);
        List<User> users = userMapper.selectByExample(userExample);
        if (users.get(0) == null) {
             user = new User();
        }else
            user = users.get(0);
        return user;
    }

}
