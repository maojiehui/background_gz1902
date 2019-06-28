package com.qf.mapper;

import com.qf.pojo.UserInfo;

/**
 * Created by DELL on 2019/6/27.
 */
public interface UserInfoMapper {

    public UserInfo getById(int id);

    public int addUserInfo(UserInfo userInfo);

    public UserInfo loginCheck(UserInfo userInfo);
}
