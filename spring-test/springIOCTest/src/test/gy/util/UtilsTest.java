package gy.util;

import gy.test.base.Utils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by yantao on 2017/3/24.
 */
public class UtilsTest {
    @Test
    public void setUp() throws Exception {
        ApplicationContext cx= new ClassPathXmlApplicationContext("util.xml");
        Utils utils = cx.getBean("utils",Utils.class);


//      use listBeanfactory
        List list = cx.getBean("emails",List.class);
    }

}