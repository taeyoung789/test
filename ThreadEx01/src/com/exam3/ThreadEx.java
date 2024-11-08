package com.exam3;

public class ThreadEx {
    public static void main(String[] args) {
        //Go g = new Go();
        //Come c = new Come();

        // 스레드화 시킨 후 실행
        //Thread t1 = new Thread(g);
        Thread t1 = new Thread(new Go());
        //Thread t2 = new Thread(c);
        Thread t2 = new Thread(new Come());

        System.out.println("시작");
        t1.start();
        t2.start();
        System.out.println("끝");
        // 꼭 순서대로 나오는 것은 아님. CPU에 따라 다름
    }
}
