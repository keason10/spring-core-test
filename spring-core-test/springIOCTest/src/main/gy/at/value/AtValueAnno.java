package gy.at.value;

import gy.test.base.StudentInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;

/**
 * Created by yantao on 2017/4/3.
 */
//@Component 可以
//@Service 可以
//@Repository
public class AtValueAnno {
    @Value("${name}")
    private String Name;
    private Long id;

    @Autowired
    @Qualifier("student1")
    private StudentInfo studentInfo;

    @Autowired
    @Qualifier("student2")
    private StudentInfo studentInfo2;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public StudentInfo getStudentInfo() {
        return studentInfo;
    }

    public void setStudentInfo(StudentInfo studentInfo) {
        this.studentInfo = studentInfo;
    }

    public StudentInfo getStudentInfo2() {
        return studentInfo2;
    }

    public void setStudentInfo2(StudentInfo studentInfo2) {
        this.studentInfo2 = studentInfo2;
    }
}
