package com.exam1;

import java.sql.*;

public class MemberList {
    public void display() {
        String url = "jdbc:mariadb://localhost:3306/memberlist";
        String user = "root";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            String sql = "SELECT * FROM user";
            rs = stmt.executeQuery(sql);

            System.out.println("회원정보목록");
            System.out.println("========================================================================");
            System.out.println("번호    이름        연락처            e-mail            그룹      생년월일     등록일");
            System.out.println("========================================================================");

            int count = 0;
            while (rs.next()) {
                String id = rs.getString("id");
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String group = rs.getString("group");
                String birth = rs.getString("birth");
                String regDate = rs.getString("reg_date");

                System.out.printf("%-6s %-10s %-14s %-20s %-6s %-10s %-10s%n",
                        id, name, phone, email, group, birth, regDate);
                count++;
            }

            System.out.println("========================================================================");
            System.out.printf("총 %d 명 ===================================================================%n", count);

        } catch (ClassNotFoundException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } finally {
            if( rs != null) { try{rs.close();} catch (SQLException e) {}}
            if( stmt != null) { try {stmt.close();} catch (SQLException e) {}}
            if(conn != null) { try { conn.close();} catch (SQLException e) {}}
        }
    }
}