package com.example.emos.wx.db.dao;

import com.example.emos.wx.db.pojo.TbPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TbPermissionMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TbPermission record);

    int insertSelective(TbPermission record);

    TbPermission selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TbPermission record);

    int updateByPrimaryKey(TbPermission record);
}