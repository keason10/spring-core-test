package gy.test.springioc;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * Created by PicaHelth on 2017/9/27.
 */
@Service("springIOC")
public class SpringIOC {
    @Value("${id}")
    private Integer id;

    @Value("${name}")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
