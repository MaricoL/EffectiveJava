package com.my.item2;

public class Person {

    private final String name;
    private final Integer age;
    private final String job;

    public Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.job = builder.job;
    }

    public static class Builder{
        private final String name;

        private Integer age;
        private String job;

        public Builder(String name) {
            this.name = name;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Builder job(String job) {
            this.job = job;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }


    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}
