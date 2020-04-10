package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.entity.Music;

import java.util.List;

/**
 * @ClassName MusicService
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/4/2 &11:57
 * @Version 1.0
 **/
public interface MusicService {
    /**
     * 批量插入
     * @param musics
     * @return int[]
     */
    int[] bathInsert(List<Music> musics);
}
