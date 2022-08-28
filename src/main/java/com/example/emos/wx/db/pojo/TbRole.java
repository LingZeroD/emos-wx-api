package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 角色表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbRole {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 角色名称
    */
    private String roleName;

    /**
    * 权限集合
    */
    private String permissions;
}