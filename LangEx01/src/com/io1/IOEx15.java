package com.io1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOEx15 {
    public static void main(String[] args) {
        Person p = new Person("홍길동", "010-1111-1111",20, "서울시");

        try {
            ObjectOutputStream oos = null;

            oos = new ObjectOutputStream(new FileOutputStream("./serial.dat"));
            oos.writeObject(p);

            System.out.println("출력 완료");
        } catch (IOException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            //if (oos )
        }
    }
}
