package com.my.item1.SPF;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

// 服务提供者 注册类
public class DriverManager {

    private static final Map<String, Driver> providers = new ConcurrentHashMap<>();

    private DriverManager(){}

    public static void registerDriver(String name , Driver driver){
        providers.putIfAbsent(name, driver);
    }

    public static Connection getConnection(String name) {
        Driver driver = providers.get(name);
        if (driver == null) {
            throw new IllegalArgumentException("没有该名称的驱动！");
        }
        return driver.getConnection();
    }



}
