package com.ljaer.security;


import com.ljaer.domain.Permission;
import com.ljaer.domain.User;
import com.ljaer.mapper.UserMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class UserMapperTest {

    @Autowired
    private UserMapper userMapper;

    @Test
    public void testFindByUsername(){
        User user = userMapper.findByUsername("zhangsan");
        System.out.println(user);
    }

    @Test
    public void testFindPermissionByUsername(){
        List<Permission> list= userMapper.findPermissionByUsername("zhangsan");
        for (Permission perm:list) {
            System.out.println(perm.getPermName()+"-"+perm.getPermTag());
        }
    }

    @Test
    public void testUpdatePassword(){
        User user = new User();
        user.setUsername("jack");
        //哈希算法+加盐
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

        user.setPassword(passwordEncoder.encode("123456"));
        userMapper.updatePassword(user);
    }
}
