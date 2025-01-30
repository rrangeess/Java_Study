package com.ohgiraffers.section01.methond;

public class Application3 {

    static int global = 10;                                      //모든 method에 쓰일 수 잇는 전역변수

    public static void main(String[] args) {

        /* 수업목표. 메소드 전달인지(argument)와 매개변수(parameter)에 대해 이해하고 메소드 호출시 활용할 수 있다. */
        /* 설명.
         *  변수를 선언한 위치에 따라 구분할 수도 있다.
         *  1. 지역변수
         *  2. 전역변수
         *  3. 매개변수
        * */

        System.out.println("전역 변수 : " + global);

        Application3 app3 = new Application3();
        app3.testMethod(13);                                //13은 전달인자
        app3.testMethod(11);
        app3.testMethod('a');                               //알파벳 a도 자동 형변환에 의해 97이 출력된다.

        int local = 20;                                         //지역변수는 쓰이고 난 후부터 인지되는 변수.
        System.out.println("지역 변수 : " + local);
    }

    public void testMethod(int age) {                           //int age 매개변수
        System.out.println("당신의 나이는" + age +  "세 입니다.");
    }
}
