package com.qf.focus.dao;

import com.qf.focus.entity.User;

import java.util.List;

public interface UserDao {

    List<User> selectAll();

    String sx();

}
