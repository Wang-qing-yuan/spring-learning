package com.soft1851.spring.ioc.dao;

import com.soft1851.spring.ioc.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {
    @Autowired
    private PostDao postDao;


    //插入
    @Test
    public void insert() throws IOException {
        byte soundbyte[]=null;
        File file = new File("D:\\picture\\1.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();
        Timestamp timestamp  =  Timestamp.valueOf(LocalDateTime.now());
        Post post = Post.builder().forumId(1).title("看电影").content("蜡笔小新剧场版").thumbnail(soundbyte).postTime(timestamp).build();
        int n = postDao.insert(post);
        assertEquals(1,n);
    }

    //批量插入
    @Test
    public void batchInsert() throws IOException{
        byte soundbyte[]=null;
        File file = new File("D:\\picture\\1.jpg");
        FileInputStream inputStream = new FileInputStream(file);
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
        int len = 0;
        byte[] tem= new byte[1024];
        while ((len=inputStream.read(tem))!=-1){
            outputStream.write(tem,0,len);
        }
        inputStream.close();
        outputStream.flush();
        outputStream.close();
        soundbyte= outputStream.toByteArray();
        Timestamp timestamp  =  Timestamp.valueOf(LocalDateTime.now());
        Post[] posts = {
                Post.builder().forumId(2).title("看电影").content("名侦探柯南").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(3).title("喝奶茶").content("四季奶青").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(4).title("运动").content("跳绳").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(5).title("看电影11").content("名侦探柯南").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(6).title("喝奶茶11").content("四季奶青").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(7).title("运动11").content("跳绳").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(8).title("看电影22").content("名侦探柯南").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(9).title("喝奶茶22").content("四季奶青").thumbnail(soundbyte).postTime(timestamp).build(),
                Post.builder().forumId(10).title("运动22").content("跳绳").thumbnail(soundbyte).postTime(timestamp).build()
        };
        List<Post> postList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(postList);
        assertEquals(9,rows.length);
    }
    @Test
    public void delete() {
        int n = postDao.delete(49);
        assertEquals(1,n);
    }

    @Test
    public void batchdelete() {
        Post[] posts={Post.builder().postId(50).build(),Post.builder().postId(52).build()};
        List<Post> postList= Arrays.asList(posts);
        int[] rows =postDao.batchDelete(postList);
        assertEquals(2,rows.length);
    }



    @Test
    public void get() {
        Post post = postDao.get(53);
        assertNotNull(post);
    }

    @Test
    public void selectByKey() {
        List<Post> post = postDao.selectByKey("奶");
        System.out.println(post);
    }
    @Test
    public void count() {
        int n = postDao.count();
        System.out.println(n);
    }
}