package com.my.item1.SPF;

// 服务提供者接口 实现类
public class SubWayDriver implements Driver {

    static {
        DriverManager.registerDriver("subway",new SubWayDriver());
    }

    @Override
    public Connection getConnection() {
        return new SubWayConnection();
    }
}

