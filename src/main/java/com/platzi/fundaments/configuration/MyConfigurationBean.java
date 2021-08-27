package com.platzi.fundaments.configuration;

import com.platzi.fundaments.bean.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfigurationBean {
    @Bean
    public MyBean beanOperation(){
        return new MyBeanImplement2();
    }

    @Bean
    public MyOperation beanOperationOperationOne(){
        return new MyOperationImpl();
        //return new MyOperation2Impl();
    }

//    @Bean
//    public MyOperation beanOperationOperation(){
//        //return new MyOperationImpl();
//        return new MyOperation2Impl();
//    }

    @Bean
    @Autowired
    public MyBeanWithDependency beanOperationWithDeppendency( MyOperation myOperation){
    //public MyBeanWithDependency beanOperationWithDeppendency( MyOperation myOperation){
        return new MyBeanWithDependencyImplement(myOperation);
    }
}
