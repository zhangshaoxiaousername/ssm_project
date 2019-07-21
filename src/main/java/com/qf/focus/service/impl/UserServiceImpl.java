package com.qf.focus.service.impl;

import com.qf.focus.dao.UserDao;
import com.qf.focus.entity.User;
import com.qf.focus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public List<User> selectAll() {

        return userDao.selectAll();
    }
}
