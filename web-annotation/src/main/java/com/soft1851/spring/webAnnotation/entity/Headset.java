package com.soft1851.spring.webAnnotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Car
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/24 &19:35
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Headset {
    private Integer id;
    private String name;
    private String cover;
    private String price;
    private String introduce;
}

