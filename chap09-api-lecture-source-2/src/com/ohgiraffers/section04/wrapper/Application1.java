package com.ohgiraffers.section04.wrapper;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. Wrapper 클래스에 대해 이해할 수 있다. */
        int intValue = 20;

        /* 설명. 기본자료형을 Wrapper 클래스 자료형으로 변환할 수 있다.(박싱, boxing)*/
        Integer autoboxingInt = 20;                         //오토 박싱(auto-boxing)
        Integer boxingInt2 = Integer.valueOf(intValue);

        /* 설명. Wrapper 클래스 자료형을 기본자료형으로 변환할 수 있다.(언박싱, unboxing) */
        int autoUnboxingInt = autoboxingInt;                //오토 언박싱(auto-unboxing)
        int unboxingInt2 = boxingInt2.intValue();

        anythingMethod(20);
        /* 설명. Wrapper 클래스 주소값 비교*/
        Integer IntegerTest = 30;
        Integer IntegerTest2 = 30;
        System.out.println("== 비교 " + (IntegerTest == IntegerTest2));
        System.out.println("integerTest 주소 : " + System.identityHashCode(IntegerTest));

        /* 설명. 모든 Wrapper 클래스들도 constatnt pool을 활용해 동등 객체는 하나만(동일 인스턴스로) 저장한다.*/
        System.out.println("integerTest2 주소 : " + System.identityHashCode(IntegerTest2));

        // 둘다 constatnt pool을 사용하기에 동등한 객체이므로 같은 주소가 나온다.
    }

    private static void anythingMethod(Object obj) {
        /* 설명. int -> integer(오토박싱) -> object(다형성) */
        /* 설명. 출력 -> Object의 toString()에서 Integer의 toString()(동적 바인딩)이 실행됨. */
        /* 설명.  원래는 obj.toString은 주소값을 가리키게 돼 있는데, 동적 바인딩이 일어나서 Integer의 값을 가리킨다. */
        System.out.println("obj: " + obj.toString());
    }
}
