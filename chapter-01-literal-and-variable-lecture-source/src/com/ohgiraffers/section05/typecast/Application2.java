package com.ohgiraffers.section05.typecast;

public class Application2 {
    public static void main(String[] args) {
        /* 수업목표. 강제 형변환 규칙에 대해 이해할 수 있다. */
        /* 설명.
         *  강제형변환
         *  바꾸려는 자료형으로 캐스팅 연산자((자료형))을 이용하여 형변환한다.
        * */

        long lNum = 8000000000L;
        int iNum = (int)lNum;                        //대입에 왼쪽은 이미 메모리에 할당 돼서 바꿀 수가 없다.
                                                     //error는 해결 했지만 데이터 손실이 일어난다.
                                                     //경우에 따라 부호및 값까지 바뀜
        System.out.println("iNum = " + iNum);

        /* 설명. 실수형 자료형 -> 정수형 자료형으로 강제 형변환하면 의도적으로 소수점 이하를 제거할 수 있다. */
        float avg = 31.235f;
        int floorNum = (int)avg;
        System.out.println("floorNum = " + floorNum);
    }
}
