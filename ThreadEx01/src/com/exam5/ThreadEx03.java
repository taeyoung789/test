package com.exam5;

public class ThreadEx03 {
    public static void main(String[] args) {
        // 실행하는 클래스도 스레드 - JVM에 대한
        System.out.println(Thread.currentThread().getPriority());

        System.out.println("count : " + Thread.activeCount());

        Thread current = Thread.currentThread();
        System.out.println(current);
        System.out.println(current.getName());
        System.out.println(current.isAlive());
        System.out.println(current.isDaemon());
    }
}
