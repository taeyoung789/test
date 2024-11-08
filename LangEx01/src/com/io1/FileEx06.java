package com.io1;

// 만약에 newtest1.txt 파일이 없으면 만들고 있으면 newtest2.txt 변경

import java.io.File;
import java.io.IOException;

public class FileEx06 {
    public static void main(String[] args) {
        File file = new File("~/java/newtest1.txt");
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else{
                file.renameTo(new File("~/java/newtest2.txt"));
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
