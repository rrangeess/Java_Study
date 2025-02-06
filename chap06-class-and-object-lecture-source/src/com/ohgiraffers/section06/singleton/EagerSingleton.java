package com.ohgiraffers.section06.singleton;

public class EagerSingleton {
    private static EagerSingleton eager;

    private EagerSingleton() {

    }

    public static EagerSingleton getInstance() {
        return eager;
    }
}
