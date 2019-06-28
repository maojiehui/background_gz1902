package com.qf.service.impl;

import com.qf.mapper.UserInfoMapper;
import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by DELL on 2019/6/27.
 */
@Service
public class UserInfoServiceImpl implements UserInfoService{

    @Autowired
    UserInfoMapper userInfoMapper;

    public UserInfo getById(int id){
        return userInfoMapper.getById(id);
    }

    @Transactional(propagation = Propagation.REQUIRED)
    public boolean addUserInfo(UserInfo userInfo) {
        int count = userInfoMapper.addUserInfo(userInfo);
        if(count>0){
            return true;
        }
        return false;
    }

    public UserInfo loginCheck(UserInfo userInfo) {
        return userInfoMapper.loginCheck(userInfo);
    }

}
