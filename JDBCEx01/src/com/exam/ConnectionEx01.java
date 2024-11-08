package com.exam;

public class ConnectionEx01 {
    public static void main(String[] args) {
        // 드라이버 이름 : org.mariadb.jdbc.Driver
        // 동적으로 클래스 로딩

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");
        } catch (Exception e) {
            System.out.println("[에러]" + e.getMessage());
        }


    }
}
