package com.exam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx02 {
    public static void main(String[] args) {
        // 스트림 생성
        // List / Set / Map -> 스트림 변경가능
        // 배열
        // 문자 배열 -> 문자열
        // 특정 범위 정수
        // 난수
        // 람다
        // 빈 스트림

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Stream<Integer> intSteam = list.stream();

        // for 문을 통한 출력
        intSteam.forEach(System.out::println);

        Stream<String> strStream = Stream.of("a", "b", "c");
        strStream.forEach(System.out::println);

        // 빈 스트림
        Stream<Integer> emptyStream = Stream.empty();
        System.out.println("출력");
        emptyStream.forEach(System.out::println);



    }
}
