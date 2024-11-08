package com.exam4;

public class InnerEx {
    public static void main(String[] args) {
        // 익명 이너 클래스
        // 참조변수 사용

        // 추상클래스 / 인터페이스
        // 상속 / 구현 -> x -> 추상 메서드를 정의해서 사용


        // 인스턴스화 하면서 메서드 오버라이드
        // 참조변수가 없음

        // 지역변수
        int x = 100;

        new InterA(){
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
                System.out.println("x : " + x);
            }
        }.viewInner();

        InterA ia = new InterA(){
            @Override
            public void viewInner() {
                System.out.println("viewInner 호출");
            }
        };

        ia.viewInner();

        new InterB() {
            public void viewInner() {
                System.out.println("추상클래스 viewInner 호출");
            }
        }.viewInner();
    }
}
