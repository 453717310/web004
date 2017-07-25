package cn.bdqn.bean;

/**
 * 学生的实体类
 * Created by dll on 2017/7/25.
 */
public class Student {
    private String name;//姓名
    private Integer age;//年龄
    private Grade grade;//年级

    public Student() {

    }

    public Student(String name, Integer age, Grade grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Grade getGrade() {
        return grade;
    }

    public void setGrade(Grade grade) {
        this.grade = grade;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade=" + grade +
                '}';
    }
}
