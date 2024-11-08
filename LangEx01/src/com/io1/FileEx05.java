package com.io1;

import java.io.File;
import java.io.IOException;

public class FileEx05 {
    public static void main(String[] args) {
        // 디렉토리 생성 / 이름변경 / 삭제
        // mkdir()
        // renameTo
        // delete

        //File dir = new File("~/java/dir3");
        //dir.mkdir();
        //dir.renameTo(new File("~/java/dir4"));

        //File dir2 = new File("~/java/dir4");
        //dir.delete();

        // 파일 생성 / 이름변경 / 삭제
        // createNewFile
        try {
            File file = new File("~/java/test2.txt");
            file.createNewFile();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }
}
