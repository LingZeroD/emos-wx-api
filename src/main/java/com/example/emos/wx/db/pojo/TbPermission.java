package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbPermission {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 权限
    */
    private String permissionName;

    /**
    * 模块ID
    */
    private Integer moduleId;

    /**
    * 行为ID
    */
    private Integer actionId;
}