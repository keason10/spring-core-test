package gy.SpringAware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by keason on 2017/8/26.
 */
public class AppUtilsTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aware.xml");
    @Test
    public void getApplicationContext() throws Exception {
        AppUtils.getApplicationContext();
    }

}