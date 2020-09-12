package com.shoppingmallproject.user.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.shoppingMallProject.bean.UmsMember;
import com.shoppingMallProject.service.UserService;
import com.shoppingmallproject.user.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UmsMember> getAllUser(UmsMember umsMember) {
        return userMapper.selectList(null);
    }

    @Override
    public UmsMember getUserById(UmsMember umsMember) {
        return userMapper.selectById(umsMember.getId());
    }
}
