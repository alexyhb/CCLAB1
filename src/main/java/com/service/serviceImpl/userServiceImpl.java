package com.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.dao.userDao;
import com.pojo.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

@Service
public class userServiceImpl implements userService {
    @Autowired
    userDao userDao;
    @Override
    public user getUser(int id) {

        JSONObject json =new JSONObject();
        user u=userDao.getUser(id);
        return u;
    }

    @Override
    public int getUserNr() {
        int nr=userDao.getUserNr();
        return nr;
    }

    @Override
    public boolean addUser(String name,String phone,String email,String role) {
        Date date = new Date();

        Timestamp timestamp = new Timestamp(date.getTime());
        boolean flag=userDao.addUser( name, phone, email,role,timestamp);
         return flag;
    }

    @Override
    public boolean deleteUser(int id) {
        boolean flag=userDao.deleteUser(id);
        return flag;
    }

    @Override
    public List<user> getUserList(){
        List<user> list =userDao.getUserList();
        return list;
    }
}
