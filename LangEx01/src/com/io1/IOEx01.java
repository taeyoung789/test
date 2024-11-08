package com.io1;

import java.io.FileInputStream;
import java.io.IOException;

public class IOEx01 {
    public static void main(String[] args) {
        // FileInputStream

        FileInputStream fis = null;

        try {
            // 파일이 없으면 Exception 발생
            fis = new FileInputStream("~/java/test.txt");
            //int data = fis.read();
            //System.out.println( (char)data );
            //data = fis.read();
            //System.out.println( (char)data );

            int data = 0;
            // 파일끝에 도달할 떄 까지 내용 읽기
            // 다국어는 읽을 수 없음
            // 엔터키도 포장해서 읽어 들임

            // Window \r\n
            // Linux, Mac - \n
            while((data = fis.read()) != -1){
                if( data == '\r') {
                    System.out.println("(r)");
                } else if( data == '\n'){   // 엔터키이면
                    System.out.println("(n)");
                } else {
                    System.out.print((char)data);
                }
            }
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            try{ fis.close(); } catch (IOException e){}
        }
    }
}
