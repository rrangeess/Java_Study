package com.ohgiraffers.section03.abstraction;

public class CarRacer {

    private Car myCar = new Car();     // 차 한대를 소유한 카레이서 등장

    public void startup() {
        myCar.startup();

    }

    public void stepAccelator() {
        this.myCar.go();
    }

    public void stepBreak() {
        this.myCar.stop();
    }

    public void turnOff() {
        this.myCar.turnOff();
    }
}
