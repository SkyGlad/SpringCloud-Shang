package org.hdxy.springcloud.sercive;

import org.hdxy.springcloud.pojo.Dept;

public interface DeptService {
    int create(Dept dept);
    Dept getDeptById(Long id);
}
