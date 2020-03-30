package com.soft1851.spring.webAnnotation.service.impl;

import com.soft1851.spring.webAnnotation.dao.VideoDao;
import com.soft1851.spring.webAnnotation.entity.Video;
import com.soft1851.spring.webAnnotation.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName VideoServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &18:05
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class VideoServiceImpl implements VideoService {
    @Autowired
    private VideoDao videoDao;

    @Override
    public List<Video> queryAll() {
        return videoDao.selectAll();
    }


    @Override
    public int[] bathInsert(List<Video> videos) {
        return videoDao.batchInsert(videos);
    }
}
