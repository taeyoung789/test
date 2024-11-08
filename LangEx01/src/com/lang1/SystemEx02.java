package com.lang1;

public class SystemEx02 {
    public static void main(String[] args) {
        System.out.println("시작");

        // else 대신 exit
        if ( args.length != 1) {
            System.out.println("비정상 실행");
            System.exit(0);
        }

        System.out.println("정상 실행");
        System.out.println("끝");
    }
}