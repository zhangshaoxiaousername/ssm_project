package com.qf.focus.service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-mybatis.xml"
        , "classpath:spring-druid.xml"
        , "classpath:spring-context.xml"})
public class CourseServiceTest {

    @Autowired
    private UserService userService;



    @Test
    public void testCheckById() {
        System.out.println(userService.selectAll());
    }










}




