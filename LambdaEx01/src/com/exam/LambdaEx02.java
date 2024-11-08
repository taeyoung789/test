package com.exam;

public class LambdaEx02 {
    public static void main(String[] args) {
        LambdaInter2 f = new LambdaInter2() {
            @Override
            public void method1() {
                System.out.println("method1 호출");
            }

            //@Override
            //public void method2() {
            //    System.out.println("method2 호출");
            //}
        };

        f.method1();
        //f.method2();

        // Lambda
        // 2개 이상이면 람다식 변경 불가
        // 인터페이스당 메서드 1개이여야 사용 가능
        //f = () -> {System.out.println("method1 호출");};
    }
}
