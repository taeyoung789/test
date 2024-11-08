package com.lang1;

public class ObjectEx03 {
    public static void main(String[] args){
        // 동등비교(==)
        int a = 10;
        int b = 10;

        // 내용값을 비교
        System.out.println( a == b );

        Object o1 = new Object();
        Object o2 = new Object();
        // 내용값 - 참조값
        System.out.println( o1 == o2 );
        // 내용값 - 데이터
        System.out.println( o1.equals(o2));

        String s1 = new String("Hello");
        String s2 = new String("Hello");

        // 참조값
        System.out.println( s1 == s2 );
        // 내용값 - 오버라이딩
        System.out.println( s1.equals(s2) );

        Person p1 = new Person(1001,"박문수", 40);
        Person p2 = new Person(1001, "박문수", 40);

        System.out.println( p1 == p2 );
        System.out.println( p1.equals(p2) );



    }
}
