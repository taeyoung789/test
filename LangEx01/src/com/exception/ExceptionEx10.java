package com.exception;

import java.io.IOException;

public class ExceptionEx10 {
    public static void main(String[] args) {
        // C:\\브라우저가 있는 폴더 위치주소\msedge.exe  //윈도우 내 프로그램
        // open -a Safari
        try {
            ProcessBuilder pb = new ProcessBuilder("");
            pb.start(); // exception 예외처리 때문에 빨간줄
        } catch (IOException e) {
            // throw new RuntimeException(e);
            System.out.println(e.getMessage());
        }


    }
}
