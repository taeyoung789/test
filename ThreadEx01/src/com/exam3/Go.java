package com.exam3;

public class Go implements Runnable {
    @Override
    public void run() {
        for ( int i = 1 ; i<= 100 ; i++ ) {
            System.out.println("Go : " + i);
        }
    }
}
