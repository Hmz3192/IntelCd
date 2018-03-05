package cn.zjnu.hmz.controller;

import cn.zjnu.hmz.service.UserService;
import cn.zjnu.hmz.utils.CipherUtil;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2018/2/23.
 */
@Controller
public class PageController {




    @Resource
    private UserService userService;

    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(String account, String password) {
//        boolean login = userService.login(account, password);
        UsernamePasswordToken token = new UsernamePasswordToken(account, CipherUtil.md5Pwd(password, account));
        Subject currentUser = SecurityUtils.getSubject();
        try {
            if (!currentUser.isAuthenticated()){//使用shiro来验证
//                token.setRememberMe(true);
                currentUser.login(token);//验证角色和权限
            }
            System.out.println("验证成功: ");
            return "back/index";
        } catch (Exception e) {
            System.out.println("验证失败"+e.getMessage());
            return "back/login";
        }
    }

    /**
     * 退出
     * @return
     */
    @RequestMapping(value = "/logout")
    public String logout() {
        Subject currentUser = SecurityUtils.getSubject();
        String result = "logout";
        currentUser.logout();
        return "back/login";
    }
    @RequestMapping("/404")
    public String to404() {
        return "404";
    }

    @RequestMapping("/tologin")
    public String tologin() {
        return "back/login";
    }


    @RequestMapping("/chart")
    public String tochart() {
        return "back/chart";
    }
    @RequestMapping("/mes")
    public String tomes() {
        return "back/mesboard";
    }

    @RequestMapping("/keys")
    public String tokeys() {
        return "back/keys";
    }
    @RequestMapping("/addkey")
    public String addkey() {
        return "back/addKey";
    }
    @RequestMapping("/addshop")
    public String addshop() {
        return "back/addshop";
    }
    @RequestMapping("/group")
    public String group() {
        return "back/group";
    }
    @RequestMapping("/man")
    public String man() {
        return "back/man";
    }
    @RequestMapping("/permission")
    public String permission() {
        return "back/permission";
    }
    @RequestMapping("/role")
    public String role() {
        return "back/role";
    }
    @RequestMapping("/shop")
    public String shop() {
        return "back/shop";
    }

    @RequestMapping("/back")
    public String toBack() {
        return "back/index";
    }
}
