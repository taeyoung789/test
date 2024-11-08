package com.util1;

import java.util.Scanner;

public class GugudanEx01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("단수 : ");

        String line = sc.nextLine();
        int dan = Integer.parseInt(line);

        for (int i = 1; i <= 9; i++) {
            System.out.printf("%s * %s = %s%n", dan, i, (dan*i));
        }

        sc.close();

    }
}
