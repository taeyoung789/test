package com.exception;

public class ExceptionEx09 {
    public void method1( int num ){
        System.out.println("시작");

        try {
            // 입력값에 대한 검사
            if (num >= 100) {
                System.out.println("정상입력");
            } else {
                //System.out.println("비정상 입력");
                throw new Exception("비정상 입력"); // JVM이 받음
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("끝");
    }

    // 처리에 대한 위임
    // 메서드 안에서 많이 사용
    public void method2( int num ) throws Exception{
        System.out.println("시작");

        if (num >= 100) {
            System.out.println("정상입력");
        } else {
            //System.out.println("비정상 입력");
            throw new Exception("비정상 입력"); // JVM이 받음
        }

        System.out.println("끝");
    }


    public static void main(String[] args) {
        ExceptionEx09 ex = new ExceptionEx09();
        ex.method1(10);
        try {
            ex.method2(20); // try 사용안하면 오류
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
