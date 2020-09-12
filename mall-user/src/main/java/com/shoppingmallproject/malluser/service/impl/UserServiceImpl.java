package com.shoppingmallproject.malluser.service.impl;

import com.shoppingMallProject.bean.UmsMember;
import com.shoppingMallProject.service.UserService;
import com.shoppingmallproject.malluser.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

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
