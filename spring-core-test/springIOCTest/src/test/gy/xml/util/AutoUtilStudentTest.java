package gy.xml.util;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by keason on 2017/10/28.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:xml-util.xml")
public class AutoUtilStudentTest {
    @Autowired
    private AutoUtilStudent autoUtilStudent;

    @Test
    public void getEmail() throws Exception {
        System.out.println(autoUtilStudent.getEmail().toString());
        System.out.println(autoUtilStudent.getMap().toString());
    }

}