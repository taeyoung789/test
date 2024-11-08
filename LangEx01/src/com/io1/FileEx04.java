package com.io1;

import java.io.File;

public class FileEx04 {
    public static void main(String[] args) {

        File dir = new File("~/java");

        String[] files = dir.list();
        for( String file : files) {
            System.out.println(file);
        }

        //cd ~/java
        //ls -l 로 확인

        // 디렉토리 [] 안에 표시
        // 파일 그냥 표시
        File[] files2 = dir.listFiles();
        for( File file : files2) {
            if(file.isDirectory()){
                //System.out.println("[" + file.getName() + "]");
                System.out.printf("[%s]%n",file.getName());
            } else {
                System.out.println(file.getName());
            }
        }


    }
}
