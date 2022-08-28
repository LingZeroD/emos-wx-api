package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 疫情城市列表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCity {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 城市名称
    */
    private String city;

    /**
    * 拼音简称
    */
    private String code;
}