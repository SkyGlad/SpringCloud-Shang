package org.hdxy.springcloud.sercive;

import org.hdxy.springcloud.dao.DeptDao;
import org.hdxy.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DeptServiceImpl implements DeptService {
    @Autowired
    private DeptDao deptDao;
    @Override
    public int create(Dept dept) {
        return deptDao.create(dept);
    }

    @Override
    public Dept getDeptById(Long id) {
        return deptDao.getDeptById(id);
    }
}
