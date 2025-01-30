package com.ohgiraffers.section03.abstraction;

import java.util.Scanner;

/* 설명.
*  클래스
*   1. 객체를 만들기 위한 도구이다.
*   2. 하나의 새로운 사용자 정의형 타입
*   3. 관련 있는 속성과 기능의 묶음
* */

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarRacer racer = new CarRacer();

        int input = 0;
        do {
            System.out.println("======= 카레이싱 프로그램 ========= ");
            System.out.println("1. 시동걸기");
            System.out.println("2. 전진");
            System.out.println("3. 정지");
            System.out.println("4. 시동끄기");
            System.out.println("9. 프로그램 종료");
            System.out.println("메뉴 선택 : ");
            input = sc.nextInt();
            switch (input) {
                case 1: racer.startup();
                    break;
                case 2: racer.stepAccelator();
                    break;
                case 3: racer.stepBreak();
                    break;
                case 4: racer.turnOff();
                    break;
                case 9:
                    System.out.println(" 프로그램을 이용해 주셔서 감사합니다.");
                    break;
                default:
                    System.out.println("잘못된 메뉴를 선택하셨습니다.");
            }
        } while(input != 9);

    }
}
