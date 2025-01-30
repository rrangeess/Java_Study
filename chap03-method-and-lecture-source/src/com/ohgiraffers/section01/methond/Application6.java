package com.ohgiraffers.section01.methond;

public class Application6 {
    public static void main(String[] args) {

        /* 수업목표. 반환값이 있는 메소드를 작성할 수 있다. */
        String result = testMethod();                   //return이 스트링인걸 알고 static내에서 호출을 하므로 메소드 자체를 static으로 만들어줌
        System.out.println("result =  " + result   );

        /* 설명. 메소드의 반환값을 한번만 쓸거라면 굳이 변수에 담지 않아도 된다.*/
        System.out.println("testMethod() =  " + testMethod()  );      //오른쪽에 testMethod가 먼저 실행됨
    }

    private static String testMethod() {
        System.out.println("testMethod 메소드 실행됨 . . .");
        return "test";
    }
}
