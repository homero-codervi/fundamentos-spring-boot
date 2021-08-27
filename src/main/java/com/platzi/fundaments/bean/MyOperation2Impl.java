package com.platzi.fundaments.bean;

public class MyOperation2Impl implements MyOperation{
    @Override
    public int sum(int number) {
        System.out.println("This is the second impl of operation.");
        return number +100;
    }
}
