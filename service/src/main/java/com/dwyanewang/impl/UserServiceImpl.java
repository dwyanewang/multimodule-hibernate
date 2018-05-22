/**
 * CopyRight (C)  2017-2018  武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/05/22 14:26
 * ProjectName : multimodule-hibernate
 * Description : UserServiceImpl
 * Version : V1.0
 */
package com.dwyanewang.impl;

import com.dwyanewang.User;
import com.dwyanewang.UserRepo;
import com.dwyanewang.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;

    @Autowired
    public UserServiceImpl(UserRepo userRepo) {
        this.userRepo = userRepo;
    }

    @Override
    public User getUserById(Long id) {
        return userRepo.getOne(id);
    }

    @Override
    public List<User> getList() {
        return userRepo.findAll();
    }
}
