package gy.life.cycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

public class MyInstantiationAwareBeanPostProcessorAdapter extends InstantiationAwareBeanPostProcessorAdapter {
    public MyInstantiationAwareBeanPostProcessorAdapter() {
        System.out.println("4 实例化 InstantiationAwareBeanPostProcessorAdapter");
    }

    //5 执行 InstantiationAwareBeanPostProcessor 的 postProcessBeforeInstantiation 方法
    public Object postProcessBeforeInstantiation(Class<?> var1, String var2) throws BeansException {
        System.out.println("5 执行 InstantiationAwareBeanPostProcessor 的 postProcessBeforeInstantiation 方法");

        return null;
    }

    //7 执行 InstantiationAwareBeanPostProcessor 的 postProcessPropertyValues 方法
    public PropertyValues postProcessPropertyValues(PropertyValues var1, PropertyDescriptor[] var2, Object var3, String var4) throws BeansException{
        String temp = "11";
        System.out.println("7 执行 InstantiationAwareBeanPostProcessor 的 postProcessPropertyValues 方法");
        return var1;
    }

    //15 执行 InstantiationAwareBeanPostProcessor 的 postProcessAfterInitialization 方法
    public boolean postProcessAfterInstantiation(Object var1, String var2) throws BeansException{
        System.out.println("15 执行 InstantiationAwareBeanPostProcessor 的 postProcessAfterInitialization 方法");
        return true;
    };
}
