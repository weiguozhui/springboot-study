package com.example.demo.dao;


import lombok.*;

@Data
/**
 * lombok插件使用示例
 */
// getter 方法
@Getter
// setter 方法
@Setter
// 所有参数构造
@AllArgsConstructor
// 重写equals和hashcode
@EqualsAndHashCode
// 无参构造方法
@NoArgsConstructor
public class LomBokDao {
private String lomBokName;
private String lomBokId;
}
