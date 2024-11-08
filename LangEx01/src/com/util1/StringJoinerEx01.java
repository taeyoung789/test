package com.util1;

import java.util.StringJoiner;

public class StringJoinerEx01 {
    public static void main(String[] args) {
        // 문자열 연결 방법
        String str1 = "사과" + ",수박" + ",딸기" + ",참외";
        System.out.println( str1 );

        // 메서드 체이닝
        String str2 = "사과".concat(",수박").concat(",딸기").concat(",참외");
        System.out.println( str2 );

        String str3 = String.format("%s,%s,%s,%s", "사과", "수박", "딸기", "참외");
        System.out.println( str3 );

        String[] arr = {"사과" , "수박" , "딸기" , "참외"};
        String str4 = String.join(",", arr);
        System.out.println( str4 );

        //
        StringJoiner joiner = new StringJoiner(",");
        // joiner.add("").add("")... 처럼 해도됨
        joiner.add("사과");
        joiner.add("수박");
        joiner.add("딸기");
        joiner.add("참외");

        System.out.println( joiner.toString());
    }
}
