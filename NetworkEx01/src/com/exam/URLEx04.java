package com.exam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class URLEx04 {
    public static void main(String[] args) {

        // 다국어 변조
        BufferedReader br = null;

        try {
            URL url = new URL("https://news.daum.net/");
            br = new BufferedReader( new InputStreamReader(url.openStream()));

            String line = null;

            boolean flag = false;
            while ((line = br.readLine()) != null) {
                // 시작 지점   <ul class="list_newsissue">
                // 끝 지점 </ul>

                // class="link_txt" data-tiara-layer="article_main"
                // </a>

                if (line.contains("class=\"link_txt\" data-tiara-layer=\"article_main\"")){
                    flag = true;
                    continue;
                }
                if (line.contains("</a>")){
                    flag = false;
                }

                if (flag){
                    System.out.println(line.trim());
                }
            }

            System.out.println();
        } catch (IOException e) {
            System.out.println("[에러] : " + e.getMessage());
        } finally {
            if(br != null) { try {br.close();} catch (IOException e) {}}
        }
    }
}
