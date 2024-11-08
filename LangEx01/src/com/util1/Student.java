package com.util1;

// 캡슐화(은닉화)
public class Student {
    private String hakbun;
    private String name;

    public Student(String name, String hakbun) {
        this.name = name;
        this.hakbun = hakbun;
    }

    public String getHakbun() {
        return hakbun;
    }

    public void setHakbun(String hakbun) {
        this.hakbun = hakbun;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "hakbun='" + hakbun + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
