package com.soft1851.spring.webAnnotation.dao.impl;


import com.soft1851.spring.webAnnotation.dao.VideoDao;
import com.soft1851.spring.webAnnotation.entity.Video;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @ClassName VideoDaoImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &17:54
 * @Version 1.0
 **/
@Repository
public class VideoDaoImpl implements VideoDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public List<Video> selectAll() {
        String sql = "SELECT * FROM t_video";
        return jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Video.class));
    }

    @Override
    public int[] batchInsert(List<Video> videos) {
        final List<Video> videoList = videos;
        String sql = "INSERT INTO t_video (video_id,video_description,video_name,video_image,video_focus)" +
                "VALUES(?,?,?,?,?)";
        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                Video video = videoList.get(i);
                preparedStatement.setString(1,video.getVideoId());
                preparedStatement.setString(2,video.getVideoDescription());
                preparedStatement.setString(3,video.getVideoName());
                preparedStatement.setString(4,video.getVideoImage());
                preparedStatement.setString(5,video.getVideoFocus());
            }

            @Override
            public int getBatchSize() {
                return videoList.size();
            }
        });
    }

}
