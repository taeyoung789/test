package com.exam2;

public class ThreadEx {
    public static void main(String[] args) {
        Go g = new Go();
        Come c = new Come();

        System.out.println("시작");

        //g.run();
        //c.run();

        // 스레드 실행용 메서드
        // start() -> run()
        // 병렬처리
        g.start();
        c.start();

        System.out.println("끝");
    }
}
