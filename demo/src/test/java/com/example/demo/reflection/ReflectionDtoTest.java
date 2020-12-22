package com.example.demo.reflection;

import jdk.nashorn.internal.runtime.logging.Logger;
import lombok.Getter;
import org.junit.jupiter.api.Test;
import org.springframework.stereotype.Component;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;


/**
 * 测试用例类
 */
class ReflectionDtoTest {

    /**
     * 获取类的class对象的方法，class对象也就类的字面量
     */
    @Test
    void getClassMethod() throws ClassNotFoundException {
        // 获取class方法1
        Class<?> reflectionDtoClass = ReflectionDto.class;
        System.out.println(reflectionDtoClass.getSimpleName());
        // 获取class对象方法2
        Class<?> reflectionDtoClass1 = Class.forName("com.example.demo.reflection.ReflectionDto");
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
        Class<?> reflectionDtoClass = ReflectionDto.class;
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
        System.out.println(catSupper.getSimpleName());
        // 把catClass类转成代表Animal类的子类
        System.out.println(catClass.asSubclass(Animal.class).getSimpleName());

        Class<?> animalClass = Animal.class;
        // 获取当前类所实现的接口,一定是直接实现的，父类实现的无法获取到
        Class<?>[] interfaces = animalClass.getInterfaces();
        for (Class<?> anInterface : interfaces) {
            System.out.println(anInterface.getName());
        }
    }

    /**
     * 获取注解的方法
     */
    @Test
    void annotation() {
        Class<Animal> animalClass = Animal.class;
        // 获取注解，可以判断此类是否有注解，从而做对应的业务处理,但是我获取lombok的setter注解时返回为null是为什么？
//        看了报提示，说是此注解不可用于反射访问？
        Logger setter = animalClass.getAnnotation(Logger.class);
        System.out.println(setter);
        Component component = animalClass.getAnnotation(Component.class);
        System.out.println(component);
        Getter getter = animalClass.getAnnotation(Getter.class);
        System.out.println(getter);
    }

    /**
     * class 的field方法的使用
     *
     * @throws NoSuchFieldException
     */
    @Test
    void fieldMethod() throws NoSuchFieldException {
        // 使用类名.class获取到对象
        Class<ReflectionDto> reflectionDtoClass = ReflectionDto.class;
        // getFields 获取类的成员变量数组,打印出属性名
        // 发现该方法只能获取到public修饰的属性
        Field[] fields = reflectionDtoClass.getFields();
        for (int i = 0; i < fields.length; i++) {
            System.out.println(fields[i].getName());
        }
        // 指定属性名称获取变量,也只能获取到公有的属性，无法获取私有和受保护的变量
        Field field = reflectionDtoClass.getField("idNumber");
        System.out.println(field.getName());
        // 可以获取所有包括私有的属性
        Field name = reflectionDtoClass.getDeclaredField("name");
        System.out.println(name.getName());
        Field[] declaredFields = reflectionDtoClass.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField.getName());
        }

    }

    /**
     * 构造方法的获取
     */
    @Test
    void classConstructorMethod() throws NoSuchMethodException {
        Class<ReflectionDto> reflectionDtoClass = ReflectionDto.class;
        // 获取构造方法集合,只能获取公共的构造方法
        Constructor<?>[] constructors = reflectionDtoClass.getConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        // 获取构造方法集合,包括私有
        Constructor<?>[] declaredConstructors = reflectionDtoClass.getDeclaredConstructors();
        for (Constructor<?> declaredConstructor : declaredConstructors) {
            System.out.println(declaredConstructor.getName());
        }
        // 根据参数类型获取指定构造方法,包括私有的
        Constructor<ReflectionDto> constructor = reflectionDtoClass.getDeclaredConstructor(String.class, int.class);
        System.out.println(constructor.getName());
    }

    /**
     * method的方法
     * @throws NoSuchMethodException
     */
    @Test
    void classMethodTest() throws NoSuchMethodException {
        Class<ReflectionDto> reflectionDtoClass = ReflectionDto.class;

        Method[] methods = reflectionDtoClass.getMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }

        Method[] declaredMethods = reflectionDtoClass.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod.getName());
        }

        Method getName = reflectionDtoClass.getDeclaredMethod("getName");
        System.out.println(getName.getName());

    }
}