package com.exam;

import java.sql.*;

public class PreparedStatementEx04 {
    public static void main(String[] args) {
        System.out.println( "시작" );

        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            System.out.println( "드라이버 로딩 성공" );

            conn = DriverManager.getConnection( url, user, password );
            System.out.println( "데이터베이스 연결 성공" );



            String sql = "select empno, ename, sal from emp where ename like ?";
            pstmt = conn.prepareStatement( sql );
            pstmt.setString( 1, "%co%" ); // ? 있으면 추가

            rs = pstmt.executeQuery();

            while ( rs.next() ) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                System.out.println( empno + "\t" + ename + "\t" + sal );
            }


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