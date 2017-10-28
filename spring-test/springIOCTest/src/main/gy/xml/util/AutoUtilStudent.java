package gy.xml.util;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * Created by yantao on 2017/4/4.
 */
@Service
public class AutoUtilStudent {
    @Resource(name = "emails")
    private List email;

    @Resource(name = "map")
    private Map map;

    public List getEmail() {
        return email;
    }

    public Map getMap() {
        return map;
    }
}
