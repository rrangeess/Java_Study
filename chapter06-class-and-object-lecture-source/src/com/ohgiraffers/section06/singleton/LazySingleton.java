package com.ohgiraffers.section06.singleton;

public class LazySingleton {

    private static LazySingleton lazy;

    public LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if(lazy == null) lazy = new LazySingleton();
        return lazy;
    }
}
