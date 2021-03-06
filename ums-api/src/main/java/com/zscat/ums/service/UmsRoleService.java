package com.zscat.ums.service;

import com.zscat.ums.model.UmsPermission;
import com.zscat.ums.model.UmsRole;


import java.util.List;

/**
 * 后台角色管理Service
 * Created by zscat on 2018/9/30.
 */
public interface UmsRoleService {
    /**
     * 添加角色
     */
    int create(UmsRole role);

    /**
     * 修改角色信息
     */
    int update(Long id, UmsRole role);

    /**
     * 批量删除角色
     */
    int delete(List<Long> ids);

    /**
     * 获取指定角色权限
     */
    List<UmsPermission> getPermissionList(Long roleId);

    /**
     * 修改指定角色的权限
     */

    int updatePermission(Long roleId, List<Long> permissionIds);

    /**
     * 获取角色列表
     */
    List<UmsRole> list();
}
