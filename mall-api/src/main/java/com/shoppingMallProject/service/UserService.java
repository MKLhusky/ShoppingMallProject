package com.shoppingMallProject.service;


import com.shoppingMallProject.bean.UmsMember;

import java.util.List;

public interface UserService {



    List<UmsMember> getAllUser(UmsMember umsMember);

    UmsMember getUserById(UmsMember umsMember);
}
