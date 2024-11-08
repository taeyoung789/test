package com.util1;

import java.util.ArrayList;

public class ArrayListEx04 {
    public static void main(String[] args) {

        Student s1 = new Student("홍길동", "1001");
        Student s2 = new Student("박문수", "1002");
        Student s3 = new Student("임꺽정", "1003");

        ArrayList<Student> al = new ArrayList<>();
        al.add(s1);
        al.add(s2);
        al.add(s3);

        System.out.println(al);

        for (int i = 0; i < al.size(); i++) {
            Student s = al.get(i);
            System.out.println(s.getHakbun());
            System.out.println(s.getName());
        }

        // 향상된 for
        for ( Student s : al) {
            System.out.println(s.getHakbun());
            System.out.println(s.getName());
        }



    }
}
