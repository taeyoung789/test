package com.io1;

import java.io.*;

public class IOEx05 {
    public static void main(String[] args) {
        // 2차 스트림인 버퍼 스트림을 활용하여 파일을 복사해주세요.
        // BufferInputStream / BufferedOutputStream 추가
        // 버퍼가 더 빠름

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;

        //FileInputStream fis = null;
        //FileOutputStream fos = null;

        try {

            //fis = new FileInputStream("~/java/data.pdf");
            //fos = new FileOutputStream("~/java/newdata.pdf");

            bis = new BufferedInputStream(new FileInputStream("~/java/data.pdf"));
            bos = new BufferedOutputStream(new FileOutputStream("~/java/newdata.pdf"));

            int data = 0;
            while( ( data = bis.read() ) != -1 ) {
                bos.write( data );
            }

            System.out.println(" 복사 완료 ");
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if( bis != null ) { try { bis.close(); } catch (IOException e) {}}
            if( bos != null ) { try { bos.close(); } catch (IOException e) {}}
        }
    }
}
