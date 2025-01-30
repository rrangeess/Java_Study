package com.ohgiraffers.section01.methond;

public class Application4 {
    public static void main(String[] args) {

        /* 수업목표. 여러개의 전달인자를 이용한 메소드 호출을 할 수 있다. */
        Application4 app4 = new Application4();
        app4.testMethod("심해원", 15, '여');


        String name = "김기종";
        int age =  15;
        char gender = '남';
        app4.testMethod(name, age, gender);
    }

    public void testMethod(String name, int age, final char gender) {
        System.out.println("이름은 " + name + "이고, 나이는 " + age + "이며, 성별은 " + gender);
    }

}
