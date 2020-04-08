package com.digitalbase.datasource.controller;

import com.digitalbase.datasource.bean.Employees;
import com.digitalbase.datasource.bean.business.BasicInfoBean;
import com.digitalbase.datasource.dao.EmployeesMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @Auther: wangc
 * @Date: 2018/10/21 22:11
 * @Description: 使用@Controller注解, 不会把返回值成json, 返回的hello会指向hello.html
 */
@RestController public class TestController {
    @Resource private EmployeesMapper employeesMapper;

    //    @Autowired
    //    private CountryMapper countryMapper;

    @RequestMapping("/hello") public String sayHello() {
        //		model.addAttribute("name", "老王");
        return "hello";
    }

    @RequestMapping("/getOneEmp") public String getOneEmp() {
        Employees employees = employeesMapper.selectById(10019);
        return employees.toString();
    }
}
