package com.shoppingmallproject.user.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.shoppingMallProject.bean.UmsMember;
import com.shoppingMallProject.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {

    @Reference
    private UserService userService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "Hello User";
    }

    @RequestMapping("getAllUser")
    @ResponseBody
    public List<UmsMember> getAllUser(UmsMember umsMember){
        //传统List<UmsMember> umsMembers = userService.getAllUser();

        List<UmsMember> allUser = userService.getAllUser(umsMember);
        return allUser;
    }

    @RequestMapping("getUserById")
    @ResponseBody
    public UmsMember getUserById(UmsMember umsMember){
        //传统List<UmsMember> umsMembers = userService.getAllUser();

        UmsMember allUser = userService.getUserById(umsMember);
        return allUser;
    }
}
