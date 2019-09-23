package com.my.item1;

import java.math.BigInteger;
import java.util.Random;

public class Test1 {

    public static void main(String[] args) {
        // 优势1：静态方法有自己方法名
        BigInteger rs1 = new BigInteger(3, 3, new Random());
        System.out.println(rs1);


        BigInteger rs2 = BigInteger.probablePrime(3, new Random());
        System.out.println(rs2);


        // 优势2：不必在每次调用他们的时候都创建一个新对象
        // public static final Boolean TRUE = new Boolean(true);
        // public static final Boolean FALSE = new Boolean(false);
        Boolean rs3 = Boolean.valueOf(true);


    }
}
