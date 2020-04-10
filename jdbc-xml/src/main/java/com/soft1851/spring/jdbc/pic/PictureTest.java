package com.soft1851.spring.jdbc.pic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;

/**
 * @ClassName PictureTest
 * @Description TODO
 * @Author wangqingyuan
 * @Version 1.0
 **/
public class PictureTest {
    public static void main(String[] args) throws IOException {
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        Picture picture = (Picture) ac.getBean("picture");
        picture.watermark();
        picture.cut();
    }
}
