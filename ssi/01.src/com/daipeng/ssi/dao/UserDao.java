package com.daipeng.ssi.dao;

import com.daipeng.ssi.entity.User;

public interface UserDao {
    
    /**
     * �û�ע��
     * @param user
     * @return
     */
     
    public boolean insertUser(User user);
     
    /**
     * �����û�����ȡ�û���Ϣ
     * @param name
     * @return
     */
     
    public User queryByname(String name);   
}