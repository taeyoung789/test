package com.exam;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx04 {
    public static void main(String[] args) {
        Stream<String> strStream = Stream.of("b", "cc", "D", "C", "AA", "F");

        // 오름차순
        //strStream.sorted().forEach(System.out::println);
        // compareTO <- Comparable라는 인터페이스 안에 있음
        // 비교 방법을 정의
        //strStream.sorted((s1, s2) -> s1.compareTo(s2)).forEach(System.out::println);

        // 내림 차순
        //strStream.sorted((s1, s2) -> s1.compareTo(s1)).forEach(System.out::println);
        //strStream.sorted(Comparator.reverseOrder()).forEach(System.out::println);

        // 대소문자 구별 없이
        strStream.sorted(String.CASE_INSENSITIVE_ORDER).forEach(System.out::println);


    }
}
