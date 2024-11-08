package com.lang1;


// 묵시적 Object 상속
public class Person /* extends Object*/ {
    private int id;
    private String name;
    private int age;

    public Person(int id, java.lang.String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

//    public String viewData() {
//        return "ID: " + this.id + " Name: " + this.name + " Age: " + this.age;
//    }

    // Override
//    public String toString() {
//        return "Hello Person";
//    }


    @java.lang.Override
    public java.lang.String toString() {
        return "Person{" +
                "id=" + id +
                ", name=" + name +
                ", age=" + age +
                '}';
    }

    public boolean equals(Object obj){
        boolean result = false;
        Person p = (Person) obj;
        // 내용값 비교 흐름
        if(p.id == this.id && p.name == this.name && p.age == this.age){
            result = true;
        }
        return result;
    }


    // 생성자 equals 사용하는 방법도 있음

}
