package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.entity.Video;

import java.util.List;

/**
 * @ClassName VideoService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &18:04
 * @Version 1.0
 **/
public interface VideoService {
    /**
     * 查询所有
     * @return List<Video>
     */
    List<Video> queryAll();


    /**
     * 批量插入
     * @param videos
     * @return int[]
     */
    int[] bathInsert(List<Video> videos);
}
