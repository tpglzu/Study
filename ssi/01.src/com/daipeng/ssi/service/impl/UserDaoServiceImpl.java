package com.daipeng.ssi.service.impl;

import com.daipeng.ssi.dao.UserDao;
import com.daipeng.ssi.entity.User;
import com.daipeng.ssi.service.UserDaoServiceInter;

public class UserDaoServiceImpl implements UserDaoServiceInter {
  
    private UserDao userdao;
    public UserDao getUserdao() {
        return userdao;
    }
    public void setUserdao(UserDao userdao) {
        this.userdao = userdao;
    }
    @Override
    public boolean insertUser(User user) {
        return userdao.insertUser(user);
    }
    @Override
    public User querybyname(String name) {
        // TODO Auto-generated method stub
        return userdao.queryByname(name);
    }
  
}
