package com.io1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class IOEx08 {
    public static void main(String[] args) {
        //FileReader fr = null;
        BufferedReader br = null;

        try {
            //fr = new FileReader("~/java/test.txt");
            br = new BufferedReader(new FileReader ("~/java/test.txt"));

            //int data = 0;
            //while ( (data = br.read() ) != -1 ) {
            //    System.out.print((char) data);
            //}

            String line = null;
            // 한 줄씩 파일 끝까지 읽기
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("[에러] " + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
        }
    }
}


