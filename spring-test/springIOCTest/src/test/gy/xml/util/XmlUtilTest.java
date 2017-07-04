package gy.xml.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by yantao on 2017/4/3.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:xml-util.xml")
public class XmlUtilTest {
    @Autowired
    @Qualifier("xmlUtilStudent-prop")
    XmlUtilStudent xmlUtilStudent;
    @Test
    public void show() {
        ApplicationContext ct= new ClassPathXmlApplicationContext("xml-util.xml") ;
        Integer integer = ct.getBean("staticField",Integer.class);

        Properties properties = ct.getBean("xmlUtilDefinedPopp",Properties.class);

        List list = ct.getBean("emails",List.class);

        Map map = ct.getBean("map", Map.class);




    }
}
