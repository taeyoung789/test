package com.lang1;

public class ProcessBuilderEx01 {
    public static void main(String[] args) throws Exception {
        // C:\\브라우저가 있는 폴더 위치주소\msedge.exe  //윈도우 내 프로그램
        // open -a Safari
        ProcessBuilder pb = new ProcessBuilder("");
        pb.start();

    }
}
