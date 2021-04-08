package com.tw.mywebapplication.config;


import com.tw.mywebapplication.DAO.Student;
import com.tw.mywebapplication.DAO.Teacher;
import com.tw.mywebapplication.bean.MyBeanPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

@Configuration
//@ComponentScan(value = "com.tw.mywebapplication", includeFilters = {
//        @ComponentScan.Filter(type = FilterType.CUSTOM, classes = {MyFilters.class})
//}, useDefaultFilters = false)

@Import(value = {Student.class, Teacher.class, MyBeanPostProcessor.class, AspectConfig.class})
@EnableAspectJAutoProxy
public class MyConfig {

//    @Bean(initMethod = "init", destroyMethod = "destroyMethod")
//    public User user() {
//        return new User();
//    }

//    @Bean
//    public UserFactoryBean userFactoryBean() {
//        return new UserFactoryBean();
//    }

}
