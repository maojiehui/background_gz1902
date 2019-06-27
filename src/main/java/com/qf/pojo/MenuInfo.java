package com.qf.pojo;

import java.util.List;

/**
 * Created by DELL on 2019/6/27.
 */
public class MenuInfo {

    int menuId;
    String menuName;
    String url;
    String icon;
    int parentId;
    List<MenuInfo> child;

    public List<MenuInfo> getChild() {
        return child;
    }

    public void setChild(List<MenuInfo> child) {
        this.child = child;
    }

    public int getMenuId() {
        return menuId;
    }

    public void setMenuId(int menuId) {
        this.menuId = menuId;
    }

    public String getMenuName() {
        return menuName;
    }

    public void setMenuName(String menuName) {
        this.menuName = menuName;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getParentId() {
        return parentId;
    }

    public void setParentId(int parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "MenuInfo{" +
                "menuId=" + menuId +
                ", menuName='" + menuName + '\'' +
                ", url='" + url + '\'' +
                ", icon='" + icon + '\'' +
                ", parentId=" + parentId +
                ", child=" + child +
                '}';
    }
}
