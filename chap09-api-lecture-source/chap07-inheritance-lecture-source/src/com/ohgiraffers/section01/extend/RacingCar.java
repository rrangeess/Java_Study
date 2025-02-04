package com.ohgiraffers.section01.extend;

public class RacingCar extends Car {

     public RacingCar() {
         super();
         System.out.println("레이싱카의 기본 생성자 호출...");
     }

    @Override
    public void run() {
        System.out.println("레이싱 자동차가 달립니답 !!!!");
    }

    public void speedUp() {
         System.out.println("스피드를 높힙니다 !!!!");
    }

    @Override
    public void soundHorn() {
        System.out.println("레이싱카는 경적따위 울리지 않습니다.");
    }
}
