package com.soft1851.spring.webAnnotation.service;

import com.soft1851.spring.webAnnotation.config.SpringDataSourceConfig;
import com.soft1851.spring.webAnnotation.entity.Video;
import com.soft1851.spring.webAnnotation.spider.VideoSpider;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {SpringDataSourceConfig.class})
@WebAppConfiguration("src/main/resources")
public class VideoServiceTest {

    @Autowired
    private VideoService videoService;

    @Test
    public void queryAll() {
        List<Video> videos = videoService.queryAll();
        assertEquals(45,videos.size());
    }


    @Test
    public void bathInsert() {
        int[] ints = videoService.bathInsert(VideoSpider.getVideo());
        assertEquals(VideoSpider.getVideo().size(),ints.length);
    }
}