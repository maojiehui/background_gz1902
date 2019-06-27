package com.qf.controller;

import com.qf.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by DELL on 2019/6/27.
 */
@RestController
public class MenuInfoController {
    @Autowired
    MenuInfoService menuInfoService;

    @RequestMapping("listAllMenu")
    public Object listAllMenu(){
        return menuInfoService.listAllMenuInfo();
    }
}
