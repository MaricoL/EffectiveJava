package com.my.item1.SPF;


// 服务接口 实现类
public class SubWayConnection implements Connection {
    @Override
    public boolean in() {
        System.out.println("进入地铁。。");
        return false;
    }

    @Override
    public boolean out() {
        System.out.println("离开地铁。。。");
        return false;
    }
}
