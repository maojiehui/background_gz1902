package com.qf.service.impl;

import com.qf.mapper.MenuInfoMapper;
import com.qf.pojo.MenuInfo;
import com.qf.service.MenuInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by DELL on 2019/6/27.
 */
@Service
public class MenuInfoServiceImpl implements MenuInfoService{

    @Autowired
    MenuInfoMapper menuInfoMapper;
    public List<MenuInfo> listAllMenuInfo() {
        return menuInfoMapper.listAllMenuInfo();
    }
}
