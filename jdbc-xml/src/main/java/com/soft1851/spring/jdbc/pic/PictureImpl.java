package com.soft1851.spring.jdbc.pic;


import cn.hutool.core.img.ImgUtil;
import cn.hutool.core.io.FileUtil;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @ClassName PictureImpl
 * @Description TODO
 * @Author wangqingyuan
 * @Version 1.0
 **/
public class PictureImpl implements Picture {

    @Override
    public void watermark() {
        ImgUtil.pressText(
                FileUtil.file("d:/picture/7.jpg"),
                FileUtil.file("d:/picture/77.jpg"),
                "wqy", Color.WHITE,
                new Font("黑体", Font.BOLD, 100),
                0,
                0,
                0.8f
        );
    }

    @Override
    public void cut() throws IOException {
        // 旋转120度
        BufferedImage image = (BufferedImage) ImgUtil.rotate(ImageIO.read(FileUtil.file("d:/picture/77.jpg")), 120);
        ImgUtil.write(image, FileUtil.file("d:/picture/777.jpg"));

    }
}
