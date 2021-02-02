package org.hdxy.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.hdxy.springcloud.pojo.CommonResult;
import org.hdxy.springcloud.pojo.Dept;
import org.hdxy.springcloud.sercive.DeptService;
import org.omg.CORBA.PUBLIC_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class DeptController {
    @Autowired
    private DeptService deptService;
    @PostMapping("/dept/add")
    public int create(Dept dept){
        log.info("****信息插入："+dept);
        return deptService.create(dept);
    }
    @GetMapping("/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        log.info("***查询id:"+id);
        return deptService.getDeptById(id);
    }
}
