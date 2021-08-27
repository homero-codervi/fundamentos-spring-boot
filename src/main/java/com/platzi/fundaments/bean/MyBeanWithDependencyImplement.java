package com.platzi.fundaments.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MyBeanWithDependencyImplement implements MyBeanWithDependency{

    MyOperation myOperation;
    //@Autowired
    //public MyBeanWithDependencyImplement(@Qualifier("myOperationImpl") MyOperation myOperation) {
    public MyBeanWithDependencyImplement( MyOperation myOperation) {
        this.myOperation = myOperation;
    }

    @Override
    public void printWithDependency() {
        System.out.println(myOperation.sum(10));

        System.out.println("Hola From the eimplementacion of one bean with dependency");
    }
}
