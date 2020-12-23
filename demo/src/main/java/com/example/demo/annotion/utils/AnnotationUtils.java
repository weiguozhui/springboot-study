package com.example.demo.annotion.utils;

import com.example.demo.annotion.AnnotationTestDto;
import com.example.demo.annotion.SetValue;
import org.hibernate.validator.constraints.br.TituloEleitoral;
import java.lang.annotation.Target;
import java.lang.reflect.Field;

/**
 * 工具类不可继承使用final关键词修饰，不可实例化构造方法私有化
 */
public final class AnnotationUtils {

    private AnnotationUtils() {
    }

    public static void analysisAnnotation(Object annotationTestDto) throws IllegalAccessException {
        Class<?> aClass = annotationTestDto.getClass();
        Field[] declaredFields = aClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            SetValue annotation = declaredField.getAnnotation(SetValue.class);
            if(null !=annotation){
                // 获取属性名类型
                Class<?> type = declaredField.getType();
                declaredField.setAccessible(true);
                System.out.println(type.getSimpleName());
                //根据属性类型设置值
                if ("String".equals(type.getSimpleName())){
                    declaredField.set(annotationTestDto,annotation.name());
                }
                if ("int".equals(type.getSimpleName())){
                    declaredField.set(annotationTestDto,annotation.intValue());
                }
                if ("boolean".equals(type.getSimpleName())){
                    declaredField.set(annotationTestDto,annotation.booleanValue());
                }
            }
        }
        System.out.println(annotationTestDto);
    }
}
