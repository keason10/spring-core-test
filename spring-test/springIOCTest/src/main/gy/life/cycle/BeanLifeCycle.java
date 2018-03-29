package gy.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

//以下2个如何使用
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;
import org.springframework.beans.factory.annotation.AutowiredAnnotationBeanPostProcessor;
//BeanPostProcessor


import java.beans.PropertyDescriptor;

public class BeanLifeCycle  implements BeanNameAware,BeanFactoryAware,InitializingBean,DisposableBean {
    private String prop;

    public String getProp() {
        return prop;
    }

    public void setProp(String prop) {
        this.prop = prop;
    }


    //1 实例化 BeanFactoryPostProcessor
    //2 执行BeanFactoryPostProcessor 的 postProcessBeanFactory
//    @Override
//    public void postProcessBeanFactory(ConfigurableListableBeanFactory configurableListableBeanFactory) throws BeansException {
//        System.out.println("BeanLifeCycle 2");
//    }

    //3实例化 BeanPostProcessor 实现类

    //4 实例化 InstantiationAwareBeanPostProcessorAdapter

    //5 执行 InstantiationAwareBeanPostProcessor 的 postProcessBeforeInstantiation 方法
    public Object postProcessBeforeInstantiation(Class<?> var1, String var2) throws BeansException{
        System.out.println("5 执行 InstantiationAwareBeanPostProcessor 的 postProcessBeforeInstantiation 方法");

        return null;
    }

    //6 执行 Bean 的构造器
    public BeanLifeCycle() {
        System.out.println("6 执行 Bean 的构造器");

    }

    //7 执行 InstantiationAwareBeanPostProcessor 的 postProcessPropertyValues 方法
    public PropertyValues postProcessPropertyValues(PropertyValues var1, PropertyDescriptor[] var2, Object var3, String var4) throws BeansException{
        System.out.println("7 执行 InstantiationAwareBeanPostProcessor 的 postProcessPropertyValues 方法");
        return null;
    }

    //8 为bean 注入属性


    //9 调用 BeanNameAware 的setName 方法
    @Override
    public void setBeanName(String s) {
        System.out.println("9 调用 BeanNameAware 的setName 方法");

    }

    //10 调用 BeanFactoryAware 的 setBeanFactory 方法
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("10 调用 BeanFactoryAware 的 setBeanFactory 方法");
    }

    //11 执行MyBeanPostProcessor BeanPostProcessor - postProcessBeforeInitialization method
//    public Object postProcessBeforeInitialization(Object var1, String var2) throws BeansException{
//        System.out.println("BeanLifeCycle 11");
//        return null;
//    };

    //12 调用 InitializingBean - afterPropertiesSet 方法
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("12 调用 InitializingBean - afterPropertiesSet 方法");

    }

    //13 调用 <bean> 的 init-method 属性指定的方法
    public void start() {
        System.out.println("13 调用 <bean> 的 init-method 属性指定的方法");
    }

    //14 执行 MyBeanPostProcessor BeanPostProcessor - postProcessAfterInitialization method
//    public Object postProcessAfterInitialization(Object var1, String var2) throws BeansException{
//        System.out.println("BeanLifeCycle 14");
//        return null;
//    };

    //15 执行 InstantiationAwareBeanPostProcessor 的 postProcessAfterInitialization 方法
    public boolean postProcessAfterInstantiation(Object var1, String var2) throws BeansException{
        System.out.println("15 执行 InstantiationAwareBeanPostProcessor 的 postProcessAfterInitialization 方法");
        return false;
    };


    //16 容器初始化成功 ，执行正常调动，下面是销毁容器


    //17 调用 DisposableBean - destroy 方法
    @Override
    public void destroy() throws Exception {
        System.out.println("17 调用 DisposableBean - destroy 方法");

    }

    //18 调用<bean> 的 destory-method 属性指定的方法
    public void stop() {
        System.out.println("18 调用<bean> 的 destory-method 属性指定的方法");

    }
}
