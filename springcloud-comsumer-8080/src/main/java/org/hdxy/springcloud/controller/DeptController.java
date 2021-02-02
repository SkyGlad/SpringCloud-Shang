package org.hdxy.springcloud.controller;

import org.hdxy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DeptController {
    @Autowired
    private RestTemplate template;

    private final static String URL = "http://localhost:8001";
    @PostMapping("/consumer/dept/add")
    public int  create(Dept dept){

        return template.postForObject(URL+"/dept/add",dept,Integer.class);
    }
    @GetMapping("/consumer/dept/get/{id}")
    public Dept getDeptById(@PathVariable("id") Long id){
        return template.getForObject(URL+"/dept/get/"+id,Dept.class);
    }
}
