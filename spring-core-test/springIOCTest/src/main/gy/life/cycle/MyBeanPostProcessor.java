package gy.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {
    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
        System.out.println("11 执行 BeanPostProcessor - postProcessBeforeInitialization method");
        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
        System.out.println("14 执行 BeanPostProcessor - postProcessAfterInitialization method");
        return o;

    }

    public MyBeanPostProcessor() {
        System.out.println("3 实例化 BeanPostProcessor 实现类");

    }
}
