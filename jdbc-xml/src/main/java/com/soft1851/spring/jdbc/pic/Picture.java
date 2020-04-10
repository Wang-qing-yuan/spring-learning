package com.soft1851.spring.jdbc.pic;

import java.io.IOException;

/**
 * @ClassName Picture
 * @Description TODO
 * @Author wangqingyuan
 * @Version 1.0
 **/
public interface Picture {
    /**
     * 添加水印
     */
    void watermark();

    /**
     * 复制之后会被裁剪
     */
    void cut() throws IOException;
}
