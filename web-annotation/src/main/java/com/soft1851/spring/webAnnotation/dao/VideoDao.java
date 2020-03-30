package com.soft1851.spring.webAnnotation.dao;

import com.soft1851.spring.webAnnotation.entity.Video;

import java.util.List;

/**
 * @ClassName VideoDao
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &17:52
 * @Version 1.0
 **/
public interface VideoDao {
    /**
     * 查询所有
     * @return
     */
    List<Video> selectAll();

    /**
     * 批量插入
     * @param videos
     * @return int[]
     */
    int[] batchInsert(List<Video> videos);

}
