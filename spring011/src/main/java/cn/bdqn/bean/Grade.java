package cn.bdqn.bean;

/**
 * 年级类
 * Created by dll on 2017/7/25.
 */
public class Grade {
    private String name;//姓名

    public Grade(String name) {
        this.name = name;
    }

    public Grade() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Grade{" +
                "name='" + name + '\'' +
                '}';
    }
}
