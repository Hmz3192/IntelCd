package cn.zjnu.hmz.service;

import cn.zjnu.hmz.model.Role;
import cn.zjnu.hmz.model.RolePermission;
import cn.zjnu.hmz.pojo.RolePermissionPojo;

import java.util.List;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2018/2/24.
 */
public interface RolePermissionService {

    RolePermissionPojo getUsersRolesAndPermission(String account);

    List<RolePermission> getAllAuthInfo();
}
