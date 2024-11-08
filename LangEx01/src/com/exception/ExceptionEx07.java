package com.exception;

public class ExceptionEx07 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        //int num1 = 0;// 비정상
        int num1 = 10; // 정상
        int num2 = 100;

        // 정상이면 catch가 else 처럼 행동
        System.out.println("1");
        try {
            System.out.println("2");
            int result = num2 / num1;
            System.out.println("3"); // 비정상이면 안함
            System.out.println("결과 : " + result);
        } catch (ArithmeticException e) {
            System.out.println("4"); // 정상이면 안함
            System.out.println("Exception 발생");
        } finally{
            System.out.println("5"); // 무조건 실행하는 구역
        }
        System.out.println("끝");

    }
}
