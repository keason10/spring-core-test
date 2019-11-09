package gy.test.springioc;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by PicaHelth on 2017/9/27.
 */
public class springIOCTest {
    @Test
    public void testSpringInit() {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:spring-ioc.xml");
        SpringIOC SpringIOC = ctx.getBean("springIOC", SpringIOC.class);
    }
}