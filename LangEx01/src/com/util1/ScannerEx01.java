package com.util1;

import java.util.Scanner;

public class ScannerEx01 {
    public static void main(String[] args) {
        // System.in - 표준입력 <= 키보드
        Scanner sc = new Scanner(System.in);
        // 입력을 위한 prompt
        System.out.print("입력 : ");
        // 단어 단위 입력
        //String msg = sc.next();

        // 3개의 단어 입력
        //String msg1 = sc.next();
        //String msg2 = sc.next();
        //String msg3 = sc.next();

        // spacebar키 까지 통째로 받음
        String msg = sc.nextLine();


        System.out.println("입력 : " + msg);
        //System.out.println("입력 : " + msg2);
        //System.out.println("입력 : " + msg3);
    }
}
