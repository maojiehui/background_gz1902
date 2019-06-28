package com.qf.controller;

import com.qf.service.MenuInfoService;
import com.qf.vo.ModifyRoleMenuVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
        return menuInfoService.listAllMenuInfo(1);
    }

    @RequestMapping("modifyMenuInfo")
    public Object modifyMenuInfo(@RequestBody ModifyRoleMenuVo modifyRoleMenuVo){

        System.out.println(modifyRoleMenuVo);

        return "hello world";
    }
}
