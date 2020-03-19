package com.soft1851.spring.ioc.config;

import com.soft1851.spring.ioc.entity.Phone;
import com.soft1851.spring.ioc.entity.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.*;

/**
 * @ClassName StudentConfig
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/19 &17:12
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.soft1851.spring.ioc")
public class StudentConfig {
    @Bean
    public List<String> hobbies(){
        List<String> hobbies = new ArrayList<>();
        hobbies.add("看电影");
        hobbies.add("喝奶茶");
        hobbies.add("运动");
        return hobbies;
    }
    @Bean
    public Set<Phone> phones(){
        Set<Phone> phones = new HashSet<>();
        phones.add(new Phone("华为",3000.0));
        phones.add(new Phone("苹果",8899.0));
        return phones;
    }
    @Bean
    public Map<Phone,String> phoneHeight(){
        Map<Phone,String> phoneHeight = new HashMap<>();
        phoneHeight.put(new Phone(),"1800");
        return phoneHeight;
    }


    @Bean
    public Student student() {
        Student student = new Student();
        student.setId(10);
        student.setName("王庆媛");
        student.setHobbies(hobbies());
        student.setPhones(phones());
        student.setPhoneHeight(phoneHeight());
        return student;
    }

}
