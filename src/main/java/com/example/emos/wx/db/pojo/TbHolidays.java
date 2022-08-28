package com.example.emos.wx.db.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
    * 节假日表
    */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbHolidays {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 日期
    */
    private Date date;
}