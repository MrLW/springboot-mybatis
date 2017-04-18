package com.lw.sb.controller;

import com.lw.sb.mapper.CityMapper;
import com.lw.sb.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lw on 2017/4/18.
 */
@RestController
@RequestMapping("/home")
public class CityController {

    @Autowired
    CityMapper mapper;

    @RequestMapping("/user")
    @ResponseBody
    public String user() {
        Dept dept = mapper.findByName("x1") ;
        System.out.println("dept:" + dept);
        return "xxx";
    }
}
