package com.daipeng.ssi.dao;

import com.daipeng.ssi.entity.User;

public interface UserDao {
    
    /**
     * 用户注册
     * @param user
     * @return
     */
     
    public boolean insertUser(User user);
     
    /**
     * 根据用户名获取用户信息
     * @param name
     * @return
     */
     
    public User queryByname(String name);   
}