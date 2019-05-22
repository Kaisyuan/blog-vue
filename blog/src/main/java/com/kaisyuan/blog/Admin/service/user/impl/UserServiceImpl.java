package com.kaisyuan.blog.Admin.service.user.impl;

import com.kaisyuan.blog.Admin.dao.user.UserDao;
import com.kaisyuan.blog.Admin.service.user.IUserService;
import com.kaisyuan.blog.entity.User;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements IUserService {

    @Resource
    private UserDao userDao;

    @Override
    public User getUserById(String id) {
        return userDao.getUserById(id);
    }
}
