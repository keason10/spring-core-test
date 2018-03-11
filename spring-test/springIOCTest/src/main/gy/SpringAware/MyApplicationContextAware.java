package gy.SpringAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

/**
 * 要用Spring Aware ，首先也要把类交于spring 管理才行。
 */
@Service
public class MyApplicationContextAware implements ApplicationContextAware,BeanNameAware,MessageSourceAware ,ResourceLoaderAware{
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        AppUtils.setApplicationContext(applicationContext);
    }

    @Override
    public void setBeanName(String s) {
        AppUtils.setBeanName(s);
    }

    @Override
    public void setMessageSource(MessageSource messageSource) {
        AppUtils.setMessageSource(messageSource);
    }

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        AppUtils.setResourceLoader(resourceLoader);
    }
}
