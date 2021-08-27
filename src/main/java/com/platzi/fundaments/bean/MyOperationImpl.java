package com.platzi.fundaments.bean;

import org.springframework.beans.factory.annotation.Qualifier;

@Qualifier("MyOperationImpl")
public class MyOperationImpl implements MyOperation{
    @Override
    public int sum(int number) {
        System.out.println("Hi!!! From the first impl");
        return number +1;
    }
}
