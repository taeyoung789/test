package com.lang1;

public class ObjectEx01 {
    public static void main(String[] args){
        //Object 클래스 생성


        //java.lang.Object(자료형)(@5ca881b5)(해쉬코드)
        Object obj1 = new Object();
        System.out.println(obj1);
        System.out.println(obj1.toString());

        // 자료형만 분리
        System.out.println(obj1.getClass().getName());

        String className = obj1.getClass().getName();
        System.out.println(className);

        // 1554547125
        System.out.println(obj1.hashCode());

        // 10 -> 16 진수 출력
        System.out.printf("%x\n", obj1.hashCode());

        //Person person = new Person();
        //System.out.println(person);

        // Object.
        //System.out.println(person.toString());

    }
}
