package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 行为表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbAction {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 行为编号
    */
    private String actionCode;

    /**
    * 行为名称
    */
    private String actionName;
}