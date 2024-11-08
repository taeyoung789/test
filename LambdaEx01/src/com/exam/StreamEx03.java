package com.exam;

import java.util.stream.IntStream;

public class StreamEx03 {
    public static void main(String[] args) {
        // 1 - 10 까지 숫자로 Stream
        //IntStream test1 = IntStream.of(1, 2, 3, 4, 5);
        IntStream test1 = IntStream.rangeClosed(1, 10);
        //test1.forEach(System.out::println);

        //test1.filter(i -> i % 2 == 0).forEach(System.out::println);

        IntStream test2 = IntStream.of(1,2,3,3,2,5,7,6,9);
        test2.distinct().forEach(System.out::println); // 중복제거



    }
}
