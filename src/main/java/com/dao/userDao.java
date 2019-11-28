package com.dao;

import com.pojo.user;
import org.apache.ibatis.annotations.Param;

import java.sql.Timestamp;
import java.util.List;

public interface userDao {
    user getUser(int id);
    List<user> getUserList();
    int getUserNr();
    boolean deleteUser(int id);
    boolean addUser(@Param("name") String name, @Param("phone") String phone, @Param("email") String email, @Param("role") String role, @Param("creat_time") Timestamp creat_time);
}
