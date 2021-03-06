package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.entity.Topic;

import java.util.List;

/**
 * @ClassName TopicServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &13:25
 * @Version 1.0
 **/
public interface TopicService {
    /**
     * 查询所有
     * @return List<Topic>
     */
    List<Topic> queryAll();

    /**
     * 新增Topic
     * @param topic
     */
    void addTopic(Topic topic);

    /**
     * 批量插入
     * @param topics
     * @return int[]
     */
    int[] bathInsert(List<Topic> topics);
}

