package com.qf.service;

import com.qf.pojo.UserInfo;

/**
 * Created by DELL on 2019/6/27.
 */
public interface UserInfoService {
    public UserInfo getById(int id);

    public boolean addUserInfo(UserInfo userInfo);
}
