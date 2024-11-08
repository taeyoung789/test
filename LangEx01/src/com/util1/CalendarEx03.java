package com.util1;

import java.util.Calendar;

public class CalendarEx03 {
    public static void main(String[] args) {
        int year = 2024;
        int month = 10;

        Calendar startCalendar = Calendar.getInstance();
        Calendar endCalendar = Calendar.getInstance();

        // 1일 정보
        startCalendar.set(year, month-1, 1);
        // 마지막 날 정보
        endCalendar.set(year, month, 1-1);

        // 요일
        int startDayofWeek = startCalendar.get(Calendar.DAY_OF_WEEK);
        // 날짜
        int endDate = endCalendar.get(Calendar.DATE);

        System.out.println(startDayofWeek);
        System.out.println(endDate);

        System.out.println(" SU MO TU WE TH FR SA ");
        for( int i =1 ; i < startDayofWeek ; i++) {
            // 공백수 3개 자리수 맞춰주기 위해
            System.out.print("   ");
        }

        // i: 날짜, n: 달력 디자인
        for( int i = 1, n = startDayofWeek ; i <= endDate ; i++, n++) {
            System.out.print((i<10) ? "  " + i : " " + i); // 공백 2개 1개
            if( n % 7 == 0 ){
                System.out.println();
            }
        }
    }
}
