package com.exam;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class URLEx02 {
    public static void main(String[] args) {

        InputStream is = null;

        try {
            URL url = new URL("https://m.daum.net/");
            is = url.openStream();

            int data = 0;
            while((data = is.read()) != -1 ) {
                System.out.print((char)data );
            }
            System.out.println();
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(is != null) { try {is.close();} catch (IOException e) {}}
        }
    }
}
