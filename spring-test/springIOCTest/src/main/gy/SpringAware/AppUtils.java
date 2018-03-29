package gy.SpringAware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.core.io.ResourceLoader;

/**
 * Created by keason on 2017/8/26.
 */
public class AppUtils {
    private static ApplicationContext applicationContext;
    private static MessageSource messageSource;
    private static String beanName;
    private static ResourceLoader resourceLoader;
    protected static  void setApplicationContext(ApplicationContext applicationContext) {
        AppUtils.applicationContext = applicationContext;
    }

    public static MessageSource getMessageSource() {
        return messageSource;
    }

    protected static void setMessageSource(MessageSource messageSource) {
        AppUtils.messageSource = messageSource;
    }

    public static String getBeanName() {
        return beanName;
    }

    protected static void setBeanName(String beanName) {
        AppUtils.beanName = beanName;
    }

    public static ApplicationContext  getApplicationContext() {
       return applicationContext;
    }

    public static ResourceLoader getResourceLoader() {
        return resourceLoader;
    }

    public static void setResourceLoader(ResourceLoader resourceLoader) {
        AppUtils.resourceLoader = resourceLoader;
    }
}
