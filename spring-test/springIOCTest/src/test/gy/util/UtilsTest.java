package gy.util;

import gy.test.base.Utils;
import gy.xml.util.MyBaseXmlUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by yantao on 2017/3/24.
 */
@ContextConfiguration("classpath:xml-util.xml")
@RunWith(SpringJUnit4ClassRunner.class)
public class UtilsTest {
    @Autowired
    private MyBaseXmlUtil myBaseXmlUtil;
    @Test
    public void setUp() throws Exception {
        ApplicationContext cx = new ClassPathXmlApplicationContext("util.xml");
        Utils utils = cx.getBean("utils", Utils.class);


//      use listBeanfactory
        List list = cx.getBean("emails", List.class);
    }

    @Test
    public void showList() {
        myBaseXmlUtil.showList();
    }

}