package com.daipeng.ssi.service;

import com.daipeng.ssi.entity.User;

public interface UserDaoServiceInter {
     
    /**
     * 用户注册服务接口
     * @param user
     * @return
     */
     
    public boolean insertUser(User user);
     
    /**
     * 根据用户名获取用户信息接口
     * @param name
     * @return
     */
     
    public User querybyname(String name);
}