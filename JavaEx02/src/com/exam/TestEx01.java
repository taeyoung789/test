package com.exam;

public class TestEx01 {
    public static void main(String[] args) {
        //System.out.println("hello");

        System.out.println(args.length);

        // tab키
        for(String arg : args){
            System.out.println(arg);
        }

        Parent parent = new Parent();
    }
}
