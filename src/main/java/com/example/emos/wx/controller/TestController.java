package com.example.emos.wx.controller;

import com.example.emos.wx.common.util.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
@Api("测试接口")
public class TestController {
    @GetMapping("sayHello")
    @ApiOperation("hello")
    public R sayHello(String name) {
        return  R.ok().put("msg","hello"+name);
    }
}
