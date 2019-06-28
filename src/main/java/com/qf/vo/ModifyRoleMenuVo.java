package com.qf.vo;

import java.util.Arrays;

/**
 * Created by DELL on 2019/6/28.
 */
public class ModifyRoleMenuVo {
    int[] idList;
    int roleId;

    public int[] getIdList() {
        return idList;
    }

    public void setIdList(int[] idList) {
        this.idList = idList;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "ModifyRoleMenuVo{" +
                "idList=" + Arrays.toString(idList) +
                ", roleId=" + roleId +
                '}';
    }
}
