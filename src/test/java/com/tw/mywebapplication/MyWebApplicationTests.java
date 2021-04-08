package com.tw.mywebapplication;

import com.tw.mywebapplication.DAO.Student;
import com.tw.mywebapplication.config.MyConfig;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;


public class MyWebApplicationTests {

    @Test
    public void testConfiguration() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

        Arrays.stream(annotationConfigApplicationContext.getBeanDefinitionNames())
                .forEach(System.out::println);

        Object userFactoryBean = annotationConfigApplicationContext.getBean("userFactoryBean");
        Object userFactoryBean1 = annotationConfigApplicationContext.getBean("userFactoryBean");
        System.out.println("userFactoryBean = " + userFactoryBean.getClass());
        System.out.println("userFactoryBean1 = " + userFactoryBean1.getClass());
        System.out.println(userFactoryBean == userFactoryBean1);

        Object userFactoryBean3 = annotationConfigApplicationContext.getBean("&userFactoryBean");
        System.out.println("userFactoryBean3 = " + userFactoryBean3.getClass());
    }

    @Test
    public void testAOPConfiguration() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MyConfig.class);

//        Arrays.stream(annotationConfigApplicationContext.getBeanDefinitionNames())
//                .forEach(System.out::println);
        Student studentBean = annotationConfigApplicationContext.getBean(Student.class);
        studentBean.hello();
        annotationConfigApplicationContext.close();

    }
}



