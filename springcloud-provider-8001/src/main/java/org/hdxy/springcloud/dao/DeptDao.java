package org.hdxy.springcloud.dao;

import org.apache.ibatis.annotations.Mapper;
import org.hdxy.springcloud.pojo.Dept;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DeptDao {
     int create(Dept dept);
    Dept getDeptById(Long id);
}
