package gy.life.cycle;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

public class BeanLifeCycleTest {


    @Test
    public void testLifeCycle() {
        ConfigurableApplicationContext ctx = new ClassPathXmlApplicationContext("life-cycle-all.xml");
//        ApplicationContext ctx = new ClassPathXmlApplicationContext("life-cycle.xml");
        System.out.println("4-1 容器初始化成功");
        ctx.getBean("cycle", BeanLifeCycle.class);
        System.out.println("现在开始关闭容器！");
        ctx.registerShutdownHook();

    }
}