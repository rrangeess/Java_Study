package com.ohgiraffers.section01.extend;

public class Car {

    private boolean runningStatus;

    public Car() {
        System.out.println("부모 클래스의 기본 생성자 호출됨...");
    }

    public void soundHorn() {
        if (runningStatus) System.out.println("부릉 ~!");
        else System.out.println("주행중이 아니라면 경적을 울릴 수 없습니다.");
    }

    public void run() {
        runningStatus = true;
        System.out.println("자동차가 달리기 시작합니다.");
    }

    public void stop() {
        runningStatus = false;
        System.out.println("자동차가 멈춥니다 !");
    }
}
