package com.example.emos.wx.service.impl;

import com.example.emos.wx.db.pojo.TbUser;
import com.example.emos.wx.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public int registerUser(String registerCode, String code, String nickname, String photo) {
        return 0;
    }

    @Override
    public Set<String> searchUserPermissions(int userId) {
        return null;
    }

    @Override
    public Integer login(String code) {
        return null;
    }

    @Override
    public TbUser searchById(int userId) {
        return null;
    }

    @Override
    public String searchUserHiredate(int userId) {
        return null;
    }

    @Override
    public HashMap searchUserSummary(int userId) {
        return null;
    }

    @Override
    public ArrayList<HashMap> searchUserGroupByDept(String keyword) {
        return null;
    }

    @Override
    public ArrayList<HashMap> searchMembers(List param) {
        return null;
    }

    @Override
    public List<HashMap> selectUserPhotoAndName(List param) {
        return null;
    }

    @Override
    public String searchMemberEmail(int id) {
        return null;
    }
}
