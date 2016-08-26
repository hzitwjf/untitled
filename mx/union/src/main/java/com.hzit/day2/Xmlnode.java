package com.hzit.day2;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Administrator on 2016/8/6.
 * 自己生成的注解
 */
@Retention(value= RetentionPolicy.RUNTIME)//注解存在于运行的时候
@Target(value= ElementType.FIELD)//注解只能作用于属性之上
public @interface Xmlnode {
    public String shuxing();
    //注解定义的属性
}
