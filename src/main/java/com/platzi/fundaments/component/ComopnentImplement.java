package com.platzi.fundaments.component;

import org.springframework.stereotype.Component;

@Component
public class ComopnentImplement implements ComponentDependency{
    @Override
    public void saludar() {
        System.out.println("Hola Mundo. Platzi");
    }
}
