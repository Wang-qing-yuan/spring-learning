package com.soft1851.spring.webAnnotation.service.impl;

import com.soft1851.spring.webAnnotation.dao.MusicDao;
import com.soft1851.spring.webAnnotation.entity.Music;
import com.soft1851.spring.webAnnotation.service.MusicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName MusicServiceImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/4/2 &11:58
 * @Version 1.0
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class MusicServiceImpl implements MusicService {
    @Autowired
    private MusicDao musicDao;

    @Override
    public int[] bathInsert(List<Music> musics) {
        return musicDao.batchInsert(musics);
    }
}
