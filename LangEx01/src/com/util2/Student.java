package com.util2;

public class Student {
    private String hakbun;
    private String name;
    // 국어 성정
    // 연산이면 int 사용
    //private int kor;
    // 입출력을 위한거면 String
    private String kor;
    private String eng;
    private String mat;

    // setter

    public Student(String hakbun, String name, String kor, String eng, String mat) {
        this.hakbun = hakbun;
        this.name = name;
        this.kor = kor;
        this.eng = eng;
        this.mat = mat;
    }

    public String getHakbun() {
        return hakbun;
    }

    public String getName() {
        return name;
    }

    public String getKor() {
        return kor;
    }

    public String getEng() {
        return eng;
    }

    public String getMat() {
        return mat;
    }
}
