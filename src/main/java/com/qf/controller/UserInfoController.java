package com.qf.controller;

import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2019/6/27.
 */
@RestController
public class UserInfoController {

    @Autowired
    UserInfoService userInfoService;

    @RequestMapping("getUserInfoById")
    public Object getUserInfoById(@RequestParam int userId){
        return userInfoService.getById(userId);
    }
}
