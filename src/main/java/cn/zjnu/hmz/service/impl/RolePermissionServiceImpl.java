package cn.zjnu.hmz.service.impl;

import cn.zjnu.hmz.dao.RolePermissionMapper;
import cn.zjnu.hmz.dao.UserRoleMapper;
import cn.zjnu.hmz.model.*;
import cn.zjnu.hmz.pojo.RolePermissionPojo;
import cn.zjnu.hmz.service.RolePermissionService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.*;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2018/2/24.
 */
@Service
@Transactional
public class RolePermissionServiceImpl implements RolePermissionService {

    @Resource
    private UserRoleMapper userRoleMapper;
    @Resource
    private RolePermissionMapper rolePermissionMapper;

    @Override
    public RolePermissionPojo getUsersRolesAndPermission(String account) {
        RolePermissionPojo rolePermissionPojo = new RolePermissionPojo();
        rolePermissionPojo.setAccount(String.valueOf(account));

        UserRoleExample example = new UserRoleExample();
        UserRoleExample.Criteria criteria = example.createCriteria();
        criteria.andUserIdEqualTo(Integer.valueOf(account));
        List<UserRole> userRoles = userRoleMapper.selectByExample(example);


        HashMap<String, String> rolesAndName = new HashMap<>();
        HashMap<String, String> permissionsAndUrl = new HashMap<>();
        Set<String> rolesKey = new HashSet<>();
        Set<String> permissionsKey = new HashSet<>();
        List<Integer> userRoleIds = new ArrayList<>();
        for(int i=0;i<userRoles.size();i++) {
            userRoleIds.add(userRoles.get(i).getRoleId());
        }

        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        RolePermissionExample.Criteria criteria1 = rolePermissionExample.createCriteria();
        criteria1.andRoleIdIn(userRoleIds);
        List<RolePermission> rolePermissions = rolePermissionMapper.selectByExample(rolePermissionExample);
        for (UserRole userRole : userRoles) {
            rolesKey.add(userRole.getRoleName());
            rolesAndName.put(String.valueOf(userRole.getRoleId()), userRole.getRoleName());
        }
        for (RolePermission rolePermission : rolePermissions) {
            permissionsKey.add(rolePermission.getPermissionUrl());
            permissionsAndUrl.put(String.valueOf(rolePermission.getPermissionId()), rolePermission.getPermissionUrl());
        }
//        rolePermissionPojo.setRolesAndName(rolesAndName);
//        rolePermissionPojo.setPermissionsAndUrl(permissionsAndUrl);
        rolePermissionPojo.setPermissionsKey(permissionsKey);
        rolePermissionPojo.setRolesKey(rolesKey);
        return rolePermissionPojo;

    }

    @Override
    public List<RolePermission> getAllAuthInfo() {
        RolePermissionExample rolePermissionExample = new RolePermissionExample();
        RolePermissionExample.Criteria criteria1 = rolePermissionExample.createCriteria();
        List<RolePermission> rolePermissions = rolePermissionMapper.selectByExample(rolePermissionExample);
        return rolePermissions;
    }


}
