package com.soft1851.spring.jdbc.interceptor;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * @ClassName picAdvice
 * @Description TODO
 * @Author wangqingyuan
 * @Date 2020/4/6 &17:28
 * @Version 1.0
 **/
@Aspect
public class picAdvice {
    /**
     * 定义切点
     */
    @Pointcut("execution(* com.soft1851.spring.jdbc..*.watermark*(..))")
    public void pointCut(){
    }
    @Before("picAdvice.pointCut()")
    public void beforeMethod(){
        System.out.println("图片在复制之前会被加上水印。。。");
    }

    @AfterReturning("execution(* com.soft1851.spring.jdbc..*.cut*(..))")
    public void afterReturning(){
        System.out.println("图片复制之后会被翻转。。。");
    }
}
