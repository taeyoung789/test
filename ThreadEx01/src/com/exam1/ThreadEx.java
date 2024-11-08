package com.exam1;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        System.out.println("시작");
        // 순차처리
        g.run();
        c.run();
        System.out.println("끝");

    }
}
