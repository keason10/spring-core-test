package gy.resource;

import org.springframework.core.env.PropertySource;

/**
 * Created by keason on 2017/8/26.
 */
public class MyResource extends PropertySource {
    public MyResource(String name) {
        super(name);
    }

    @Override
    public Object getProperty(String s) {
        return null;
    }
}
