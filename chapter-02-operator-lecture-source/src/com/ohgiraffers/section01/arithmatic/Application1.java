package com.ohgiraffers.section01.arithmatic;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. 산술연산자에 대해 이해하고 활용할 수 있다. */
        int num1 = 20;
        int num2 = 7;

        System.out.println("num1 + num2 = " + (num1 + num2));
        System.out.println("num1 - num2 = " + (num1 - num2));
        System.out.println("num1 * num2 = " + (num1 * num2));

        double testNum = num1 / (double)num2;
        System.out.println("testNum = " + testNum);


        System.out.println("num1 % num2 = " + (num1 % num2));          //퍼센트가 아닌 모듈러스로 읽기
    }
}
