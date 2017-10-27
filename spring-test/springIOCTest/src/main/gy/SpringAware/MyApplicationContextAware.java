package gy.SpringAware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.MessageSource;
import org.springframework.context.MessageSourceAware;
import org.springframework.stereotype.Service;

/**
 * 要用Spring Aware ，首先也要把类交于spring 管理才行。
 */
@Service
public class MyApplicationContextAware implements ApplicationContextAware,BeanNameAware,MessageSourceAware {
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
}
