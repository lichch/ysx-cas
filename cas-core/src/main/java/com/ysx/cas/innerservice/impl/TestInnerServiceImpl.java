package com.ysx.cas.innerservice.impl;

import com.ysx.cas.dao.YsxTscpCourseRoleMapper;
import com.ysx.cas.innerservice.TestInnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestInnerServiceImpl implements TestInnerService {
    @Autowired
    private YsxTscpCourseRoleMapper ysxTscpCourseRoleMapper;

    @Override
    public void test() {
        try {
            ysxTscpCourseRoleMapper.getBean(27);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
