package com.qf.mapper;

import com.qf.pojo.MenuInfo;

import java.util.List;
import java.util.Set;

/**
 * Created by DELL on 2019/6/27.
 */
public interface MenuInfoMapper {

    public List<MenuInfo> listAllMenuInfo(int roleId);

    public Set<MenuInfo> getMenuByUserId(int userId);

}
