package com.exam2;

public class Go extends Thread{
    public void run() {
        // 스레드에서 작업할 내용 기술
        for ( int i = 1 ; i<= 10 ; i++ ) {
            System.out.println("Go : " + i);
        }
    }
}
