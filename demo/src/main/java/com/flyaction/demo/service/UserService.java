package com.flyaction.demo.service;


import com.flyaction.demo.entities.User;

/**
 * @auther zzyy
 * @create 2024-02-17 16:14
 */
public interface UserService
{
    public int addUser(User user);

    public User getUserById(Integer id);
}
