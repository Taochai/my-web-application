package com.tw.mywebapplication.DAO;

import lombok.Data;
import lombok.Setter;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
@Data
public class User implements InitializingBean, DisposableBean {
    @Setter
    public String name;
    public int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public User() {
        System.out.println("user constructor!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void init() {
        System.out.println("init method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    public void destroyMethod() {
        System.out.println("destroy method!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean destroy!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("postConstruct!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    @PreDestroy
    public void preDestroy() {
        System.out.println("preDestroy!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
