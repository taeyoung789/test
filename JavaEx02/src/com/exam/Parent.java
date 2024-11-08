package com.exam;

public class Parent {
    private String data;
    private String data2;

    // 오버로딩 생성자 ( 생성 -> 생성자 )
    public Parent(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData2() {
        return data2;
    }

    public void setData2(String data2) {
        this.data2 = data2;
    }

    public Parent() {
        System.out.println("Parent Constructor");
    }
}
