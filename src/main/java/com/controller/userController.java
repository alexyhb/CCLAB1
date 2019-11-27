package com.controller;

import com.alibaba.fastjson.JSONObject;
import com.pojo.user;
import com.service.serviceImpl.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class userController {
    @Autowired
    public com.service.serviceImpl.userServiceImpl userServiceImpl;


    /**
     *
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUserList" ,method = RequestMethod.POST)
    public String getUserList() {
        List<user> list= userServiceImpl.getUserList();
        JSONObject json= new JSONObject();
        json.put("user", JSONObject.toJSON(list));
        return json.toJSONString();
    }
    /**
     *
     * @param id
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getUser" ,method = RequestMethod.POST)
    public String getUserInfo(@RequestParam("id") int id ) {
       user u= userServiceImpl.getUser(id);
        JSONObject json= new JSONObject();
        json.put("user", JSONObject.toJSON(u));
        return json.toJSONString();
    }

    /**
     *
     *
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "/getNr" ,method = RequestMethod.POST)
    public String getUserInfo() {
        int nr= userServiceImpl.getUserNr();
        JSONObject json= new JSONObject();
        json.put("res", JSONObject.toJSON(nr));
        return json.toJSONString();
    }
    @ResponseBody
    @RequestMapping(value = "/addUser" ,method = RequestMethod.POST)
    public String addUser(@RequestParam("name") String name ,@RequestParam("phone") String phone,@RequestParam("email") String email  ,@RequestParam("role") String role) {
        boolean nr= userServiceImpl.addUser(name, phone, email,role);
        JSONObject json= new JSONObject();
        json.put("res", JSONObject.toJSON(nr));
        return json.toJSONString();
    }
}
