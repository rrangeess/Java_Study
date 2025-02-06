package com.ohgiraffers.section6.time;

import java.time.*;

public class Applicaiton1 {
    public static void main(String[] args) {
        
        /* 수업목표 time 패키지에서 제공하는 클래스들의 사용 방법을 이해할 수 있다. */
        LocalTime timeNow = LocalTime.now();
        LocalTime timeNow2 = LocalTime.of(14, 33, 20);
        System.out.println("timeNow = " + timeNow);
        System.out.println("time2 = " + timeNow2);
        
        LocalDate dateNow = LocalDate.now();
        LocalDate dateOf = LocalDate.of(2025, 2, 5);
        System.out.println("dateNow = " + dateNow);
        System.out.println("dateOf = " + dateOf);

        LocalDateTime dateTimeNow = LocalDateTime.now();
        LocalDateTime dateTimeOf = LocalDateTime.of(2025, 2, 5, 14, 33, 20);
        System.out.println("dateTimeNow = " + dateTimeNow);
        System.out.println("datTImeOf = " + dateTimeOf);

        ZonedDateTime zonedDateTimeNow = ZonedDateTime.now();
        ZonedDateTime zoneDateTimeOf =
                    ZonedDateTime.of(dateOf, timeNow2, ZoneId.of("Asia/Seoul"));
        System.out.println("zoneDateTime = " + zonedDateTimeNow);
        System.out.println("zoneDateTimeOf = " + zoneDateTimeOf);
        
    }
}
