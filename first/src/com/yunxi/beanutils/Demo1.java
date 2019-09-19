package com.yunxi.beanutils;

import org.apache.commons.beanutils.BeanUtils;

import java.lang.reflect.InvocationTargetException;

public class Demo1 {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Person person = new Person();
        System.out.println(person.toString());
        BeanUtils.setProperty(person,"name","1");
        System.out.println(person.toString());
    }

}
