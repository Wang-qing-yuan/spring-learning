package com.soft1851.spring.ico.config;

import com.soft1851.spring.ico.entity.Book;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @ClassName BookTest
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/17 &20:48
 * @Version 1.0
 **/
public class BookTest {
    public static void main(String[] args) {
        //生成基于注解配置的应用上下文对象
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
//        手动开启扫包
        ctx.scan("com.soft1851.spring.ioc.config");
//        ctx.refresh();
        Book book = (Book) ctx.getBean("book");
        book.setName("java");
        book.setPrice(88.8);
        System.out.println(book);
    }

}

