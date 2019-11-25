package com.service.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.dao.userDao;
import com.pojo.user;
import com.service.userService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
    public boolean addUser(String name,int phone,String email) {
         boolean flag=userDao.addUser( name, phone, email);
         return flag;
    }

    @Override
    public List<user> getUserList(){
        List<user> list =userDao.getUserList();
        return list;
    }
}
