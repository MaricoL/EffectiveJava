package com.my.item3;

// 和公有域类似，但更加简洁，提供了序列化机制，防止反序列化为多个不同实例
public enum EnumSingleton {
    INSTANCE;

    public void doSomething() {
    }
}
