package com.exam5;

public class Gugudan extends Thread {
    private int dan;

    public Gugudan(int dan) {
        this.dan = dan;
    }
    public void run() {
        // getName() - 스레드이름
        System.out.println(this.getName() + "시작");

        for( int i = 0; i <= 9; i++ ) {
            System.out.printf("%s * %s = %s%n", dan , i , (dan*i) );
        }

        System.out.println(this.getName() + "끝");
    }
}
