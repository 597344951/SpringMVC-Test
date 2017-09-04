package com.test.base;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


/**
 * Reason: 公共SpringMVC Junit测试基类 <br/>
 * date: 2017年9月4日 下午2:45:03 <br/>
 * 
 * @author Wangch
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath*:/spring/spring-mvc.xml"})
public class BaseJunitTest {

    @Test
    public void test(){
        
    }
}
