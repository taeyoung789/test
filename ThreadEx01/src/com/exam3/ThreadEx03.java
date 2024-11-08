package com.exam3;

public class ThreadEx03 {
    public static void main(String[] args) {
        // lambda화
        Thread t1 = new Thread(() -> {
            for ( int i = 1 ; i<= 100 ; i++ ) {
                System.out.println("Go : " + i);
            }
        });

        Thread t2 = new Thread(() -> {
            for ( int i = 1 ; i<= 100 ; i++ ) {
                System.out.println("Come : " + i);
            }
        });

        System.out.println("시작");

        t1.start();
        t2.start();

        System.out.println("끝");
    }
}
