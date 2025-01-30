package com.ohgiraffers.section01.methond;

public class Application2 {
    public static void main(String[] args) {
        System.out.println("main() 시작됨 ...");

        /* 설명. non-static 메소드인 경우 메소드를 new 연산자로 인지시켜 호출할 수 있다.  */
        Application2 app = new Application2();    //클래스의 내부를 밝혀서, static을 안 쓰고 void 없이 method 쓰기 가능
        app.methodA();                            //.의 의미 = 접근 연산자
        app.methodB();

        System.out.println("main() 종료됨 ...");
    }

    public void methodA() {
        System.out.println("methodA() 호출됨 ...");    //non-static method
        System.out.println("methodA() 호출됨 ...");
    }
    public void methodB() {
        System.out.println("methodB() 호출됨 ...");
        System.out.println("methodB() 호출됨 ...");
    }
}
