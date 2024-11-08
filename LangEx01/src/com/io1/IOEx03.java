package com.io1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IOEx03 {
    public static void main(String[] args) {
        // 파일 내용을 복사
        FileInputStream fis = null;
        FileOutputStream fos = null;

        try {
            // 텍스트 파일 / 바이너리 파일
            //fis = new FileInputStream("~/java/test.txt");
            //fos = new FileOutputStream("~/java/newtest.txt");

            fis = new FileInputStream("~/java/data.pdf");
            fos = new FileOutputStream("~/java/newdata.pdf");

            int data = 0;
            while( ( data = fis.read() ) != -1 ) {
                fos.write( data );
            }

            System.out.println(" 복사 완료 ");
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if( fis != null ) { try { fis.close(); } catch (IOException e) {}}
            if( fos != null ) { try { fos.close(); } catch (IOException e) {}}
        }
    }
}

//아시는 바와 같이 Mac은 경로명 문자열을 달리하면 정상적으로 실행이 된답니다 ^^
//
//Win : "c:/java/…" ->
//Mac : "/Users/사용자이름/java/..."
