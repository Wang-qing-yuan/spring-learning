package com.soft1851.spring.webAnnotation.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName video
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &17:45
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Video {
    private String videoId;
    private String videoDescription;
    private String videoName;
    private String videoImage;
    private String videoFocus;
}
