package com.soft1851.spring.ico.dao;

import com.soft1851.spring.ico.entity.Forum;

import java.util.List;

/**
 * @ClassName ForumDao
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/17 &15:14
 * @Version 1.0
 **/
public interface ForumDao {
    /**
     * 新增Forum
     * @param forum
     * @return int
     */
    int insert(Forum forum);

    /**
     * 批量新增Forum
     * @param  forums
     * @return int[]
     */
    int[] batchInsert(List<Forum> forums);

    /**
     * 根据id删除Forum
     * @param forumId
     * @return int
     */
    int delete(int forumId);

    /**
     * 修改Forum
     * @param  forum
     * @retirn
     */
    int update(Forum forum);

    /**
     * 根据id查询Forum
     * @param  forumId
     * @return Forum
     */
    Forum get(int forumId);

    /**
     * 查询所有论坛消息
     * @return List<Forum>
     */
    List<Forum> selectAll();
}
