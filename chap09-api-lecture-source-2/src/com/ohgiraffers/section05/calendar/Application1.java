package com.ohgiraffers.section05.calendar;

import java.text.SimpleDateFormat;

public class Application1 {
    public static void main(String[] args) {

        /* 수업목표. java.util.Date 클래스 사용법을 이해하고 활용할 수 있다. */
        java.util.Date today = new java.util.Date();            //시스템의 현재 시간을 가진 객체 생성
        System.out.println("today = " + today);

        System.out.println("long 타입 시간 : " + today.getTime());
        System.out.println("long 타입 시간을 활용한 Date : " + new java.util.Date(0L));         //최초의 인지 시간이 나옴
        System.out.println("long 타입 시간을 활용한 Date : " + new java.util.Date(today.getTime()));

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E요일"); //패턴을 인식하는 객체
        String todayFormat = sdf.format(today);
        System.out.println("todayFormat = " + todayFormat);

        /* 설명. java.util.Date -> java.sql.Date */
        java.util.Date today2  = new java.util.Date();System.out.println("long 타입 시간을 활용한 Date : " + new java.util.Date(0L));
        java.sql.Date sqlDate = new java.sql.Date(today2.getTime());

        /* 설명. java.sql.Date -> java.util.Date */
        java.util.Date today3 = sqlDate;            // 다형성 적용 -> sql.date는 util.date를 extends




    }
}
