package com.example.emos.wx.db.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 签到表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbCheckin {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 用户ID
    */
    private Integer userId;

    /**
    * 签到地址
    */
    private String address;

    /**
    * 国家
    */
    private String country;

    /**
    * 省份
    */
    private String province;

    /**
    * 城市
    */
    private String city;

    /**
    * 区划
    */
    private String district;

    /**
    * 考勤结果
    */
    private Byte status;

    /**
    * 风险等级
    */
    private Integer risk;

    /**
    * 签到日期
    */
    private Date date;

    /**
    * 签到时间
    */
    private Date createTime;
}