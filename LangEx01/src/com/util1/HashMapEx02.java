package com.util1;

import java.util.Collection;
import java.util.HashMap;

public class HashMapEx02 {
    public static void main(String[] args) {
        Student s1 = new Student("박문수", "1001");
        Student s2 = new Student("홍길동", "1002");
        Student s3 = new Student("임꺽정", "1003");

        HashMap<String, Student> map = new HashMap<>();
        map.put("a", s1);
        map.put("b", s2);
        map.put("c", s3);
        System.out.println(map);

        // key

        // value
        Collection<Student> values = map.values();
        for (Student student : values) {
            System.out.println(student);
        }




    }
}
