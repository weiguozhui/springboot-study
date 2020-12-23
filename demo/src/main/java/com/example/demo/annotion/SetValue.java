package com.example.demo.annotion;

import com.sun.deploy.net.proxy.WDefaultBrowserProxyConfig;

import java.lang.annotation.*;

/**
 * 自定义注解
 * 使用@interface定义这是一个注解
 *
 * 注解属性是数组则用{}填属性
 *
 * @Target 注解用于描述注解可以使用在什么地方
 * ElementType
 * TYPE,作用于类、接口、枚举
 * FIELD, 作用于属性和变量
 * METHOD, 作用于方法
 * 下面的不常用
 * PARAMETER, 作用于参数
 * CONSTRUCTOR, 作用于构造方法
 * LOCAL_VARIABLE, 本地变量？
 * ANNOTATION_TYPE, 注解类型
 * PACKAGE, 包
 * TYPE_PARAMETER, 类的参数
 * TYPE_USE
 *
 * @Retention 用于表示注解的保存范围
 * RetentionPolicy枚举类
 * SOURCE 源码中
 * CLASS 字节码文件中
 * RUNTIME 运行时
 *
 * @Documented 用于描述是否生成API文档 。没有属性
 * @Inherited 该注解是否可继承 没有属性
 * 常用的就是target和retention两个元注解
 */
@Target(value={ElementType.TYPE,ElementType.FIELD,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
//@Documented
//@Inherited
public @interface SetValue {
    // 属性就是抽象方法
    String name() default "";
    // 默认值为0
    int intValue() default 0;

    // boolean型的值
    boolean booleanValue() default false;
    
}
