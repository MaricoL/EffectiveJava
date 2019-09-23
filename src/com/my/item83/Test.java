package com.my.item83;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Test {
    private volatile FieldType fieldType;

    private FieldType getFieldType() {
//        FieldType result = fieldType;
        if (fieldType == null) {
            synchronized (this) {
                if (fieldType == null) {
                    fieldType = new FieldType();
                }
            }
        }
        return fieldType;
    }


    public static void main(String[] args) {
        Test test = new Test();

        Runnable run = () ->{
            for (long i = 0; i <= 9999999999L; i++) {
                test.getFieldType();
            }
        };


        long start = System.currentTimeMillis();
        for (int i = 0; i < 5; i++) {
            new Thread(run).run();
        }

        while (true) {
            if (Thread.activeCount() == 2) break;
        }


        long end = System.currentTimeMillis();
        System.out.println(end - start);

    }
}
