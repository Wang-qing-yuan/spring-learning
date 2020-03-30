package com.soft1851.spring.webAnnotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName Rank
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &13:22
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Rank {
    private Integer id;
    private String author;
    private String pic;
    private String title;
    private String duration;
}
