package com.example.demo.annotion;

/**
 * 自定义注解测试Dto
 */
public class AnnotationTestDto {
    @SetValue(name = "hello")
    private String name;

    @SetValue(intValue = 12)
    private int age;

    @SetValue(booleanValue = true)
    private boolean flag;

    public AnnotationTestDto() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "AnnotationTestDto{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", flag=" + flag +
                '}';
    }
}
