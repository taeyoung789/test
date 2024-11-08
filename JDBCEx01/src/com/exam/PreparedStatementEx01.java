package com.exam;

import java.sql.*;

public class PreparedStatementEx01 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            System.out.println( "드라이버 로딩 성공" );

            conn = DriverManager.getConnection( url, user, password );
            System.out.println( "데이터베이스 연결 성공" );


            String sql = "insert into dept2 values (? , ?, ?)";
            pstmt = conn.prepareStatement( sql );
            pstmt.setInt( 1, 61 );
            pstmt.setString( 2, "영업부" );
            pstmt.setString( 3, "서울" );

            int result = pstmt.executeUpdate(); // 괄호에 sql이 안들어감. 공백
            System.out.println("쿼리 실행 성공");

        } catch (ClassNotFoundException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } catch (SQLException e) {
            System.out.println( "[에러] " + e.getMessage() );
        } finally {
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {} }
            if (conn != null) { try { conn.close(); } catch (SQLException e) {} }
        }

        System.out.println( "끝" );
    }
}