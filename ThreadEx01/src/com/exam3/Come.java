package com.exam3;

public class Come implements Runnable  {
    @Override
    public void run() {
        for ( int i = 1 ; i<= 100 ; i++ ) {
            System.out.println("Come : " + i);
        }
    }
}
