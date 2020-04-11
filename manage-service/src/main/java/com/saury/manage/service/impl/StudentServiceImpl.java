package com.saury.manage.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.saury.bean.Student;
import com.saury.service.StudentService;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Override
    public List<Student> findAll() {
        return null;
    }
}
