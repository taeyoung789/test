package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx02 {
    public static void main(String[] args) {
        // 디렉토리
        File file = new File("~/java");
        // 디렉토리 생성
        //System.out.println(file.mkdir());
        // 디렉토리인지 / 파일인지 구분
        System.out.println(file.isDirectory());
        System.out.println(file.isFile());

        // canExcute()/canRead()/canWrite()
        // isHidden()
        //맥에서는 속성을 확인
        //ls -l test.txt
        // 속성 숨김으로 변경
        File file2 = new File("~/java/test.txt");
        System.out.println(file2.isHidden());

        // 현재 경로
        File file3 = new File(".");

        // 경로
        // file일때랑 file2랑 다름
        System.out.println(file.getName());
        System.out.println(file.getParent());
        System.out.println(file.getPath());
        try {
            System.out.println(file3.getCanonicalPath()); // file3에서만
        } catch(IOException e) {
            throw new RuntimeException(e);
        }




    }
}
