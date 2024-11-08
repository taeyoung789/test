package com.io1;

import java.io.File;

public class FileEx01 {
    public static void main(String[] args) {
        // Directory(특수목적파일) / File

        // 경로
        // 절대경로 : 드라이브명 부터 추격  C:\Java\JavaProjects\JavaEx01
        // 상대경로 : 현재 실행위치 부터 추격 .(현재) / .. (부모)

        // 경로를 통해서 File 객체 생성
        // 디렉토리에 대한 File 객체 생성
        // File dir = new File("c:\\java");
        File dir = new File("~/java");
        System.out.println( dir );

        // 파일에 대한 File 객체 생성
        File file = new File("~/java/test.txt");
        System.out.println( file );
        File file2 = new File("~/java","test.txt");
        System.out.println( file2 );

        // 존재 유무
        System.out.println( dir.exists() ); // 저 위치에 있으면
        System.out.println( file.exists() );


        //(잠시 선회할게요~) Mac에서는 루트 디렉토리에 폴더와 파일을 만들 수 없어서 홈디렉토리에 만들어주시면 좋을 것 같아요 ^^;
        //홈디렉토리 '~/java'
        //cd ~
        //mkdir java
        //cd java
        //touch test.txt
    }
}
