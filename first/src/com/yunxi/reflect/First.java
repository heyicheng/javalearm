package com.yunxi.reflect;


import java.lang.reflect.Constructor;

public class First {
    public static void main(String[] args) throws NoSuchMethodException, ClassNotFoundException {
        Class<?> cls = Class.forName("com.yunxi.reflect.Ufs");

        /**
         * Constructor[] getConstructors();
         * 获取当前类内所有非私有化constructor数组
         *
         * */
        Constructor<?>[] constructor1 = cls.getConstructors();
        for (Constructor value :
            constructor1) {
            System.out.println(value);
        }
        Constructor<?> constructor5=cls.getConstructor(int.class);
        System.out.println(constructor5);
//        for (Constructor<?> constructoiuiu:
//         constructor){
//
//        }
        System.out.println(constructor1+"fsdf");
        System.out.println(constructor1+"fsdf");
        System.out.println(constructor1+"fsdf");
    }
}
class Ufs{
    public Ufs() {
        super();
    }
    public Ufs(int jjj) {
        super();
    }
    public void sdjfjas(){

    }
    public void sdjfjas(int jsjs){

    }
}
