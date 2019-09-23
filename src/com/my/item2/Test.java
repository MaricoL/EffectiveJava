package com.my.item2;

public class Test {
    public static void main(String[] args) {

        Person person = new Person.Builder("tom").age(10).job("police").build();
        System.out.println(person);
    }
}
