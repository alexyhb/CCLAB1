package com.service;

import com.alibaba.fastjson.JSONObject;
import com.pojo.user;

import java.util.List;

public interface userService {
    user getUser(int id);
    int getUserNr();
    boolean addUser(String name,String phone,String email,String role);
    boolean deleteUser(int id);
    List<user> getUserList();
}
