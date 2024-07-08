package com.sky.annotation;

import com.sky.enumeration.OperationType;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 自定义注解，用于标识某个方法需要进行功能字段自动填充处理
 */
@Target(ElementType.METHOD)//说明了Annotation所修饰的对象范围,此处说明该注解修饰方法
@Retention(RetentionPolicy.RUNTIME)//是Java注解中的一个元注解，用于指定被注解的元素在什么时候有效。具体来说，它定义了被注解的元素的保留策略，即注解在运行时仍然有效。
public @interface AutoFill {
    OperationType value();
}
