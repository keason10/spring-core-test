package gy.xml.util;

import java.util.List;

/**
 * Created by yantao on 2017/4/4.
 */
public class XmlUtilStudent {
    private Long id;
    private String name;
    private Integer staticField;
    private List list;

    public List getList() {
        return list;
    }

    public void setList(List list) {
        this.list = list;
    }

    public Integer getStaticField() {
        return staticField;
    }

    public void setStaticField(Integer staticField) {
        this.staticField = staticField;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
