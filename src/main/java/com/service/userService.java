package com.service;

import com.alibaba.fastjson.JSONObject;
import com.pojo.user;

import java.util.List;

public interface userService {
    user getUser(int id);
    int getUserNr();
    boolean addUser(String name,int phone,String email);

    List<user> getUserList();
}
