package com.exam;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionEx02 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;


        try {
            Class.forName("org.mariadb.jdbc.Driver");
            System.out.println("드라이버 로딩 성공");
            conn = DriverManager.getConnection(url,user,password);
            System.out.println("데이터베이스 연결 성공");
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]:" + e.getMessage());
        } finally {
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }


    }
}
