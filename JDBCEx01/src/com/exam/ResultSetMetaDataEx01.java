package com.exam;

import java.sql.*;

public class ResultSetMetaDataEx01 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            conn = DriverManager.getConnection( url, user, password );

            //String sql = "select * from emp";
            String sql = "select empno, ename, sal, hiredate from emp";
            pstmt = conn.prepareStatement( sql );

            rs = pstmt.executeQuery();

            ResultSetMetaData resultSetMetaData = rs.getMetaData();
            System.out.println( resultSetMetaData.getColumnCount() );

            for( int i = 1; i <= resultSetMetaData.getColumnCount(); i++ ) {
                System.out.println( resultSetMetaData.getColumnName( i ) + "\t" );
                System.out.println( resultSetMetaData.getColumnTypeName( i ) + "\t" );
                System.out.println( resultSetMetaData.getColumnDisplaySize( i ) + "\t" );
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]:" + e.getMessage());
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) { e.printStackTrace(); }}
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) { e.printStackTrace(); }}
            if (conn != null) { try { conn.close(); } catch (SQLException e) { e.printStackTrace(); }}
        }


    }
}
