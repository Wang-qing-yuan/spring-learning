package com.soft1851.spring.webAnnotation.service.impl;

import com.soft1851.spring.webAnnotation.dao.TopicDao;
import com.soft1851.spring.webAnnotation.entity.Topic;
import com.soft1851.spring.webAnnotation.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName TopicServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &13:23
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class TopicServiceImpl implements TopicService {

    @Autowired
    private TopicDao topicDao;

    @Override
    public List<Topic> queryAll() {
        return topicDao.selectAll();
    }

    @Override
    public void addTopic(Topic topic) {
        topicDao.insert(topic);
//        try {
//            int a = 1 / 0;
//        } catch (Exception e){
//            e.printStackTrace();
//            throw new RuntimeException();
//        }

    }

    @Override
    public int[] bathInsert(List<Topic> topics) {
        return topicDao.batchInsert(topics);
    }
}

