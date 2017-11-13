package com.tae.dao;

import com.tae.old.User;

import java.util.List;

/**
 * Created by Taeyeon-Serenity on 2017/8/26.
 */
public interface UserDao {
    public User findUserById(Integer id);

    public List<User> findUserByUsername(String username);
}
