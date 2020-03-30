package com.soft1851.spring.webAnnotation.spider;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.webAnnotation.entity.Video;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName VideoSpider
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &18:28
 * @Version 1.0
 **/
public class VideoSpider {
    private static final Integer SUCCESS = 200;

    public static List<Video> getVideo(){
        List<Video> videos = new ArrayList<>();
        //目标地址
        String url = "https://pcw-api.iqiyi.com/search/video/videolists?access_play_control_platform=14&channel_id=6&data_type=1&from=pcw_list&is_album_finished=&is_purchase=&key=&market_release_date_level=&mode=11&pageNum=2&pageSize=48&site=iqiyi&source_type=&three_category_id=&without_qipu=1";
        //创建httpclient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get对象
        HttpGet get = new HttpGet(url);
        //创建context对象
        HttpClientContext context = HttpClientContext.create();
        //创建response对象
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(get,context);
        } catch (IOException e){
            e.printStackTrace();
        }
        System.out.println(response.getStatusLine());
        //如果请求成功，则获取网页源码
        if(response.getStatusLine().getStatusCode() == SUCCESS){
            HttpEntity entity = response.getEntity();
            String res = null;
            try {
                res = EntityUtils.toString(entity,"UTF-8");
            } catch (IOException e){
                e.printStackTrace();
            }

            JSONObject jsonObject = JSONObject.parseObject(res);
            JSONArray list = jsonObject.getJSONObject("data").getJSONArray("list");
//            System.out.println(list);

            list.forEach(o -> {
                JSONObject json = JSONObject.parseObject(o.toString());
                Video video = Video.builder()
                        .videoId(json.getString("tvId"))
                        .videoDescription(json.getString("description"))
                        .videoName(json.getString("name"))
                        .videoImage(json.getString("imageUrl"))
                        .videoFocus(json.getString("focus"))
                        .build();
                videos.add(video);
            });
        } else {
            System.out.println("请求失败");
        }
        try {
            response.close();
            httpClient.close();
        } catch (IOException e){
            e.printStackTrace();
        }
        return videos;
    }

    public static void main(String[] args) {
        for (Video video : getVideo()){
            System.out.println(video);
        }
    }
}
