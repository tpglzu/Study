package com.daipeng.ssi.service;

import com.daipeng.ssi.entity.User;

public interface UserDaoServiceInter {
     
    /**
     * �û�ע�����ӿ�
     * @param user
     * @return
     */
     
    public boolean insertUser(User user);
     
    /**
     * �����û�����ȡ�û���Ϣ�ӿ�
     * @param name
     * @return
     */
     
    public User querybyname(String name);
}