package com.example.emos.wx.db.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TbDept {
    /**
    * 主键
    */
    private Integer id;

    /**
    * 部门名称
    */
    private String deptName;
}