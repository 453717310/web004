package cn.bdqn.bean;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by dll on 2017/7/25.
 */
public class StudentTest {

    @Test
    public void test(){
        ApplicationContext ac=new ClassPathXmlApplicationContext("application.xml");
        Student student= (Student) ac.getBean("student");
        System.out.println(student);
    }

}