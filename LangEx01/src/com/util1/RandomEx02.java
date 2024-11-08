package com.util1;

import java.util.Random;

// 로또번호 생성기

public class RandomEx02 {
    public static void main(String[] args) {
        Random rand = new Random(System.currentTimeMillis());

        // 중복 처리 알고리즘 넣어보기!!
        for (int i = 0; i <= 5; i++) {
            for(int j = 1 ; j <= 6 ; j++){
                System.out.printf("%2d " , rand.nextInt(45) + 1);
            }
            System.out.println();
        }
    }
}
