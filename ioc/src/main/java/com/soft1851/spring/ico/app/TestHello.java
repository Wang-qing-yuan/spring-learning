package com.soft1851.spring.ico.app;

import com.soft1851.spring.ico.entity.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @ClassName TestHello
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/17 &9:15
 * @Version 1.0
 **/
public class TestHello {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Hello hello = (Hello) ac.getBean("hello");
        hello.sayHello();
    }
}
