package com.my.item1.SPF;

public class MyTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("com.my.item1.SPF.SubWayDriver");
        DriverManager.getConnection("subway");
    }
}
