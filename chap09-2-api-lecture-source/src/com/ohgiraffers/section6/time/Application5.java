package com.ohgiraffers.section6.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Application5 {
    public static void main(String[] args) {
        
        /* 수업목표. time 패키지의 클래스들에 포메팅을 적용하여 출력할 수 있다. */
        
        String timeNow = "15:10:10";
        String dateNow = "2025-02-05";
        
        LocalTime localTime = LocalTime.parse(dateNow);  //parse라는 메소드만으로도 :으로 파싱하여 데이터를 처리한다.
        LocalDate localDate = LocalDate.parse(dateNow);
        LocalDateTime localDateTime = LocalDateTime.of(localDate, localTime);

        System.out.println("localTime = " + localTime);
        System.out.println("localDate = " + localDate);
        System.out.println("localDateTime = " + localDateTime);
        
        /* 설명. 수동적으로 패턴을 인식해 줘야할 시*/
        String timeNow2 = "15-14-14";
        String dateNow2 = "20250205";
        
        LocalTime localTime2 = LocalTime.parse(timeNow2, DateTimeFormatter.ofPattern("HH-mm-ss"));
        LocalDate localDate2 = LocalDate.parse(dateNow2, DateTimeFormatter.ofPattern("yyyy-mm-dd"));

        System.out.println("localTime2 = " + localTime2);
        System.out.println("localDate2 = " + localDate2);

        /* 설명. time 패키지에서 인식한 날짜 및 시간을 우리가 원하는 패턴의 문자열로 반환하기 */
        String dateFormat = localDate2.format(DateTimeFormatter.ofPattern("yyyy년 mm월 dd일"));
        String timeFormat = localTime2.format(DateTimeFormatter.ofPattern("HH:mm"));
        System.out.println("dateFormat = " + dateFormat);
        System.out.println("timeFormat = " + timeFormat);


    }
}
