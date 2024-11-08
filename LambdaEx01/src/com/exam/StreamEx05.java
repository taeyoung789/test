package com.exam;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx05 {
    public static void main(String[] args) {
        // map
        // 원하는 필드 추출 / 특정 형태로 변환
        File file1 = new File("ext1.java");
        File file2= new File("ext1.bak");
        File file3 = new File("ext2.java");
        File file4 = new File("ext3");
        File file5 = new File("ext1.txt");

        File[] fileArr = {file1,file2,file3,file4,file5};

        Stream<File> fileStream = Stream.of(fileArr);
        //fileStream.map(File::getName).forEach(System.out::println);

        // 확장자를 추출
        // 확장자가 없는 것은 제외
        // 중복 제거
        fileStream.map(File::getName)
                .filter(s -> s.indexOf('.') != -1) // 확장자 없는 내용 제외
                .peek(s -> System.out.println("peek : " + s))
                .map(s -> s.substring(s.indexOf('.') + 1 ))  // 확장자 추출
                .peek(s -> System.out.println("peek : " + s))  // 변하는 과정을 보고 싶을 때
                .distinct()
                .forEach(System.out::println);



    }
}
