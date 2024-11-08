package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx03 {
    public static void main(String[] args) {

        // 다국어 변조
        BufferedReader br = null;

        try {
            URL url = new URL("https://m.daum.net/");
            br = new BufferedReader( new InputStreamReader(url.openStream()));

//            int data = 0;
//            while((data = br.read()) != -1 ) {
//                System.out.print((char)data );
//            }

            // 결과는 똑같음
            String line = null;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(br != null) { try {br.close();} catch (IOException e) {}}
        }
    }
}
