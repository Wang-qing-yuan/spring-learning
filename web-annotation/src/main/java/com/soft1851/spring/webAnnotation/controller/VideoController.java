package com.soft1851.spring.webAnnotation.controller;

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.util.ResponseObject;
import com.soft1851.spring.webAnnotation.service.VideoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @ClassName VideoController
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/3/28 &20:13
 * @Version 1.0
 **/
@Controller
@RequestMapping(value = "/")
public class VideoController {
    @Autowired
    private VideoService videoService;

    @GetMapping(value = "videos",produces = "appliacation/json;charset=utf-8")
    @ResponseBody
    public String getVideos(){
        ResponseObject rs = new ResponseObject(1,"success",videoService.queryAll());
        return JSONObject.toJSONString(rs);
    }

    @GetMapping("/video")
    public String video(Model model){
        model.addAttribute("videos",videoService.queryAll());
        return "video";
    }

}
