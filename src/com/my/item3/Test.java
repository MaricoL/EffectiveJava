package com.my.item3;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Test {

    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        System.out.println(PublicFinalSingleton.INSTANCE);
//
//        Constructor<PublicFinalSingleton> constructor = PublicFinalSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        PublicFinalSingleton singleton = constructor.newInstance();
//        System.out.println(singleton.INSTANCE);

        System.out.println(PublicFinalSingleton.INSTANCE);
        System.out.println(PublicFinalSingleton.INSTANCE);
        System.out.println(PublicFinalSingleton.INSTANCE);


        System.out.println(PrivateFinalSingleton.getInstance());
        System.out.println(PrivateFinalSingleton.getInstance());
        System.out.println(PrivateFinalSingleton.getInstance());
        System.out.println(PrivateFinalSingleton.getInstance());


        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
        System.out.println(EnumSingleton.INSTANCE.hashCode());
    }
}
