package com.util1;

import java.util.Stack;

public class StackEx01 {
    public static void main(String[] args) {

        Stack<String> stack = new Stack<>();

        // push, pop
        stack.push("홍길동");
        stack.push("박문수");
        stack.push("임꺽정");

        System.out.println(stack);

        // add도 가능하지만 전문용어는 push
        stack.add("이몽룡");
        System.out.println(stack);

        // 내용 확인
        String data = stack.get(3);
        System.out.println(data);
        System.out.println(stack);

        // 데이터 꺼내기
        String popData = stack.pop();
        System.out.println(popData);
        System.out.println(stack);





    }
}
