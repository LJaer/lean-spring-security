package com.ljaer.mapper;


import com.ljaer.domain.Permission;
import com.ljaer.domain.User;

import java.util.List;

public interface UserMapper {
    /**
     * 查询当前用户对象
     */
    User findByUsername(String username);

    /**
     * 查询当前用户拥有的权限
     */
    List<Permission> findPermissionByUsername(String username);

    /**
     * 修改密码
     */
    void updatePassword(User user);
}
