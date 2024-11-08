package com.exception;

import java.util.Date;

public class ExceptionEx05 {
    public static void main(String[] args) {
        System.out.println("시작");

        Date date1 = new Date();
        Date date2 = null;

        System.out.println(date1.toLocaleString());
        try {
            // try 구역은 가능한 최소로
            System.out.println(date2.toLocaleString());
        } catch (NullPointerException e) {
            // NullPointerException e = new ~ (JVM)

            // Exception의 내용을 확인
            System.out.println(e.toString());
            System.out.println(e.getMessage()); //*
            e.printStackTrace();
        }

        System.out.println("끝");
    }
}
