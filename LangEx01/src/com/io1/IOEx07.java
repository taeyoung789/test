package com.io1;

import java.io.FileWriter;
import java.io.IOException;

public class IOEx07 {
    public static void main(String[] args) {
        FileWriter fw = null;

        try {
            fw = new FileWriter("~/java/newtest.txt");

            fw.write("Hello");
            fw.write("\n");
            fw.write(System.lineSeparator()); // 엔터키
            fw.write("Hello");

            System.out.println( "입력 완료" );
        } catch (IOException e) {
            System.out.println("[에러]" + e.getMessage());
        } finally {
            if (fw != null) { try { fw.close(); } catch (IOException e) {}}
        }
    }
}
