package com.exam;

public class LambdaEx01 {
    public static void main(String[] args) {

        // 첫번째 방식
        new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        }.method();

        // 두번째 방식 => lambda
        LambdaInter1 f = new LambdaInter1() {
            @Override
            public void method() {
                System.out.println("Hello Lambda");
            }
        };
        f.method();

        // lambda로 변경하는 메서드의 내용은 간단해야한다
        f = () -> {System.out.println("Hello Lambda3");};
        f.method();

        f = () -> System.out.println("Hello Lambda4");
        f.method();

    }
}
