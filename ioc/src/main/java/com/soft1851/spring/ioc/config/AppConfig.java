package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Book;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName AppConfig
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/17 &20:51
 * @Version 1.0
 **/
@Configuration
public class AppConfig {
    @Bean
    public Book book(){
        return new Book();
    }
}
