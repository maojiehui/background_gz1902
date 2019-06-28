package com.qf.controller;

import com.qf.pojo.UserInfo;
import com.qf.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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

    @RequestMapping("loginCheck")
    public Object loginCheck(@RequestBody UserInfo userInfo, HttpServletRequest request){
        HttpSession session = request.getSession();
        UserInfo userInfo1 = userInfoService.loginCheck(userInfo);
        session.setAttribute("userInfo",userInfo1);
        if(userInfo1!=null){
            return "true";
        }
        return "false";
    }
}
