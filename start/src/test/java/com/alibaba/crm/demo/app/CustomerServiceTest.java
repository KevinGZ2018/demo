package com.alibaba.crm.demo.app;

import com.alibaba.crm.demo.TestApplication;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by fulan.zjf on 2017/11/29.
 */
@RunWith(SpringRunner.class)
//@SpringBootTest(classes = {TestApplication.class})
public class CustomerServiceTest {

    @Test
    public void dummyTest(){
        Assert.assertEquals(true, true);
    }
}
