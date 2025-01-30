package com.ohgiraffers.section01.methond;

public class Application1 {
    public static void main(String[] args) {          // ()라는 메소드를 통해서 연산되고 값이 void로 출력되는데


        /* 수업목표. 메소드의 호출 흐름에 대해 이해할 수 있다. */
        System.out.println("main() 시작함...");
        methodA();
        System.out.println("main() 종료함...");
    }

    public static void methodA() {                            // static을 안 붙이면 main에서 보이지가 않아서 회색이 뜨면
        System.out.println("methodA() 호출됨...");
        methodB();
        System.out.println("methondA() 종료됨...");
    }

    public static void methodB() {
        System.out.println("methodB() 호출됨 ...");            //static을 안 붙히면 static을 붙힌 곳에서 작동이 안됨
        System.out.println("methodB() 종료됨 ...");
    }
}
