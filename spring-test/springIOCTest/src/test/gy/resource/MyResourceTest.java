package gy.resource;

import gy.SpringAware.AppUtils;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.core.env.MapPropertySource;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.ResourcePropertySource;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.PropertyResourceBundle;

import static org.junit.Assert.*;

/**
 * Created by keason on 2017/8/26.
 */
public class MyResourceTest {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-aware.xml");
    @Test
    public void testResource() throws Exception {
        Resource resource = AppUtils.getApplicationContext().getResource("classpath:spring-aware.properties");
        InputStreamReader inputStream = new InputStreamReader(resource.getInputStream());
        BufferedReader reader = new BufferedReader(inputStream);
        String line ="";
        while ((line = reader.readLine()) !=null) {
            System.out.println(line);
        }


        resource = AppUtils.getApplicationContext().getResource("classpath:spring-resource.txt");
        inputStream = new InputStreamReader(resource.getInputStream());
        reader = new BufferedReader(inputStream);
        while ((line = reader.readLine()) !=null) {
            System.out.println(line);
        }

        //提供方法，把property加入到ApplicationContext中的Environment中，具体的PropertySource 实现类，看接口
        Map<String,Object> map = new HashMap<>();
        map.put("id",1001);
        map.put("name","name1001");
        PropertySource  propertySource = new MapPropertySource("map",map);
        MutablePropertySources propertySources =((ConfigurableApplicationContext) AppUtils.getApplicationContext()).getEnvironment().getPropertySources();
        propertySources.addFirst(propertySource);


        Resource resource1 =  AppUtils.getApplicationContext().getResource("classpath:spring-aware.properties");
        PropertySource propertySource1 = new ResourcePropertySource(resource1);
        propertySources.addFirst(propertySource1);


        //通过java.util.Properties 加载property文件
        Properties properties = new Properties();
        properties.load(resource1.getInputStream());

    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}