package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 模块资源表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbModule {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 模块编号
    */
    private String moduleCode;

    /**
    * 模块名称
    */
    private String moduleName;
}