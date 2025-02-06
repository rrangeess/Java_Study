package com.ohgiraffers.section01.array;

public class Application5 {
    public static void main(String[] args) {

        /* 수업목표. 배열을 사용해 간단한 카드 뽑기 게임을 작성해보자.*/
        String[] shape = {"SPADE", "CLOVER", "HEART", "DIAMOND"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

        int randomShapeIndex = (int) (Math.random() * shape.length); //shape.length의
        int randomNumberIndex = (int) (Math.random() * numbers.length);

        System.out.println("당신이 뽑은 카드는" + shape[randomShapeIndex] + " "
                            + numbers[randomNumberIndex] + " 카드입니다.");
    }
}
