package com.ohgiraffers.section02.dimensional;

public class Application {
    public static void main(String[] args) {

        /* 수업목표. 다차원 배열의 구조를 이해하고 사용할 수 있다. */
        /* 설명.
         *   다차원 배열
         *    다차원 배열은 2차원 이상의 배열을 의미한다.
         *    (일반적으로 3차원 정도까지 고려한다. (사람의 인지 범위))
         * */

        int[][] iArr1;
        int[] iArr2;        //추천 x
        int 1Arr3[][]       //추천 x

        1Arr1 = new int[3][2];
        1Arr2 = new int[3][];

        int num = 0;
        for (int i = 0; i < iArr1.length; i++) {
            System.out.print("iArr[i] : " + iArr1[i]);
            for (int j = 0; j < iArr1[i].length; j++) {
                iArr1[i][j] = ++num;
            }
            System.out.println();

        }

        /* 설명. 가변배열에 다양한 길이의 1차원 배열을 적용해보자. */
        iArr2[0] = new int[]{1, 2, 3};
        iArr2[1] = new int[]{1, 2, 3, 4};
        iArr2[2] = new int[]{3, 3};

        for (int i)
    }
}
