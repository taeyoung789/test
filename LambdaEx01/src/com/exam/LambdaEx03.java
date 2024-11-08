package com.exam;

public class LambdaEx03 {
    public static void main(String[] args) {
        /*
        LambdaInter3 f = (int x) -> {
            System.out.println("method 호출 : " + x);
        };


        f = (int x) -> System.out.println("method 호출 : " + x);

        f = x -> System.out.println("method 호출 : " + x);

        f.method(10);

        */

        LambdaInter3 f = (x, y) -> System.out.println("method 호출 : " + x + " : " + y);
        f.method(10,20);

    }
}
