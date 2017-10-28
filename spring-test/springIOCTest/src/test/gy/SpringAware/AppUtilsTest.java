package gy.SpringAware;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.InputStreamSource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.io.InputStream;

import static org.junit.Assert.*;

/**
 * Created by keason on 2017/8/26.
 */
public class AppUtilsTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aware.xml");
    @Test
    public void getApplicationContext() throws Exception {
        AppUtils.getApplicationContext();
    }

    @Test
    public void showAware() throws IOException {
        ResourceLoader resourceLoader = AppUtils.getResourceLoader();
        //注意此处文件路径要3个斜杠
        Resource resource = resourceLoader.getResource("file:///D:/A1.log");
        InputStream inputStream = resource.getInputStream();
    }

}