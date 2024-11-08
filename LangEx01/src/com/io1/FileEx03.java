package com.io1;

import java.io.File;
import java.util.Date;

public class FileEx03 {
    public static void main(String[] args) {
        // 맥에서는 Finder를 통해 적당한 파일을 data.pdf로 이름 변경 후 홈디렉토리/java 폴더로 복사 또는 이동 후 진행해주세요~
        File file = new File("~/java/data.pdf");
        // 파일 크기
        long fileSize = file.length();
        // byte -> Kbyte
        // 1000 -> 2 -> 1024
        System.out.println("File Size: " + fileSize / 1024); // 반올림이냐 내림이냐 올림이냐에 따라 실제 크기랑 다르게 나올 수 있음

        // 수정 날짜 (1970년 이후부터 밀리세컨드)
        long fileDate = file.lastModified();
        System.out.println( fileDate );

        // 원하는 날짜
        System.out.println( new Date(fileDate).toLocaleString());
    }
}
