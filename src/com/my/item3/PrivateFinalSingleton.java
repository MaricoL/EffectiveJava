package com.my.item3;

public class PrivateFinalSingleton {
    private static final PrivateFinalSingleton INSTANCE = new PrivateFinalSingleton();

    private PrivateFinalSingleton(){}

    public static PrivateFinalSingleton getInstance() {
        return INSTANCE;
    }
}
