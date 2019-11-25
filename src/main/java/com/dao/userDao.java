package com.dao;

import com.pojo.user;

import java.util.List;

public interface userDao {
    user getUser(int id);
    List<user> getUserList();
    int getUserNr();
    boolean addUser(String name,int phone,String email);
}
