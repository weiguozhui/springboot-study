package com.example.demo.reflection;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 测试用例类
 */
class ReflectionDtoTest {

    @Test
    void testClass1() {
        // 使用类名.class获取到对象
        Class<ReflectionDto> reflectionDtoClass = ReflectionDto.class;
        // 获取到全类名
        System.out.println(reflectionDtoClass.getName());
        // 获取不带包名的类名
        System.out.println(reflectionDtoClass.getSimpleName());
        // 得到的也是不带包名的类名
        System.out.println(reflectionDtoClass.getCanonicalName());
        // 用getMethods获取到对象的方法列表
        Method[] methods = reflectionDtoClass.getMethods();
        // 遍历出所有的方法名
        for (int i = 0; i < methods.length; i++) {
            System.out.println(methods[i].getName());
        }

        // getFields 获取类的成员变量数组,打印出属性名
        // 发现该方法只能获取到public修饰的属性
        Field[] fields =reflectionDtoClass.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
    }

    /**
     * 获取类的class对象的方法，class对象也就类的字面量
     */
    @Test
    void getClassMethod() throws ClassNotFoundException {
        // 获取class方法1
        Class<?> reflectionDtoClass = ReflectionDto.class;
        System.out.println(reflectionDtoClass.getSimpleName());
        // 获取class对象方法2
        Class<?> reflectionDtoClass1 =  Class.forName("com.example.demo.reflection.ReflectionDto");
        System.out.println(reflectionDtoClass1.getSimpleName());
        // 获取class对象方法3
        ReflectionDto reflectionDto = new ReflectionDto();
        Class<?> reflectionDtoClass2 = reflectionDto.getClass();
        System.out.println(reflectionDtoClass2.getSimpleName());
    }

    /**
     * Class 对象的相关方法
     */
    @Test
    void classMethods() throws IllegalAccessException, InstantiationException {
        // 获取Class对象
        Class<?> reflectionDtoClass=ReflectionDto.class;
        // 获取包名
        System.out.println(reflectionDtoClass.getPackage());
        System.out.println(reflectionDtoClass.getCanonicalName());
        // 实例化对象
        ReflectionDto reflectionDto = (ReflectionDto) reflectionDtoClass.newInstance();
        System.out.println(reflectionDto.toString());

        //获取这类的类加载器
        ClassLoader classLoader = reflectionDtoClass.getClassLoader();
        System.out.println(classLoader.getClass().getSimpleName());
//         获取该类的所有内部公共类和接口,私有类无法获取到
        Class<?>[] classes = reflectionDtoClass.getClasses();
        for (Class<?> aClass : classes) {
            System.out.println(aClass.getSimpleName());
        }
        // 获取所有的内部类，接口，包括私有
        Class<?>[] classes2 = reflectionDtoClass.getDeclaredClasses();
        for (Class<?> aClass : classes2) {
            System.out.println(aClass.getSimpleName());
        }
//         获取父类class
       Class<?> catClass = Cat.class;
       Class<?> catSupper = catClass.getSuperclass();
//       System.out.println(catSupper.getSimpleName());
        // 把catClass类转成代表Animal类的子类
       System.out.println(catClass.asSubclass(Animal.class).getSimpleName());

        Class<?> animalClass = Animal.class;
        // 获取当前类所实现的接口,一定是直接实现的，父类实现的无法获取到
        Class<?>[] interfaces = animalClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }
}