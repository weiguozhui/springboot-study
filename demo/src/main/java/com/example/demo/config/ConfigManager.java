package com.example.demo.config;

import com.example.demo.dao.LomBokDao;
import com.example.demo.dao.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 使用@configuration定义这个类为配置类,相当于以前的xml文件配置，定义该类为配置类
@Configuration
public class ConfigManager {

    //  相对于以前的xml的bean装配，这样做的好处个人认为是更加的面向对象了
    // 可以不指定name属性，则根据类型注入，指定name属性，可以使用@resource注解指定获取指定的name，name属性相当于xml配置的bean的id
    @Bean(name = "userBean")
    public User user() {
        User user = new User();
        user.setAge(30);
        user.setName("weiguozhui");
        user.setPhoneNumber("12345678");
        return user;
    }

    @Bean
    public LomBokDao getLomBokDao(){
        LomBokDao lomBokDao=new LomBokDao();
        lomBokDao.setLomBokId("lombok1");
        lomBokDao.setLomBokName("lombok test");
        return lomBokDao;

    }
}
