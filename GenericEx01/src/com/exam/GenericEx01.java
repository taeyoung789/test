package com.exam;

import java.util.ArrayList;
import java.util.List;

public class GenericEx01 {
    public static void main(String[] args) {
        // 비제네릭 코드
        // 내부 데이터 규정
        // 컴파일 타입(데이터형) 체크가 안됨
        List list = new ArrayList();
        list.add("A");
        list.add(1);
        list.add(Integer.valueOf(2));

        String str = (String) list.get(0);
        System.out.println(str);

        List<String> list2 = new ArrayList();
        list2.add("A");
        list2.add("A");
        //list2.add(1);  // 체크
        // 형변환 제거
        str = list2.get(0);



    }
}
