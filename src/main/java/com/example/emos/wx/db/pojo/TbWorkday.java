package com.example.emos.wx.db.pojo;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbWorkday {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 日期
    */
    private Date date;
}