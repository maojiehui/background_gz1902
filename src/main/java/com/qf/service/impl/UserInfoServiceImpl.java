package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by DELL on 2019/6/27.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    {
        System.out.println("init UserInfoServiceImpl");
    }
    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo getById(int id){
        return userInfoMapper.getById(id);
    }

}
