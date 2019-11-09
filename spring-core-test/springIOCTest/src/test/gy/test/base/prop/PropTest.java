package gy.test.base.prop;

import gy.test.base.StudentInfo;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Properties;

/**
 * Created by yantao on 2017/3/24.
 */
public class PropTest {
    @Test //使用prop文件进行注入
    public void test1() {
        ApplicationContext cx = new ClassPathXmlApplicationContext("spring.xml");
        StudentInfo studentInfo = cx.getBean("student-prop", StudentInfo.class);
        Long id = cx.getBean("student-prop.id", Long.class);

        Properties properties = cx.getBean("propertiesInstance", Properties.class);

    }
}
