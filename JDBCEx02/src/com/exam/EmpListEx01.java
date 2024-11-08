package com.exam;

import java.sql.*;


public class EmpListEx01 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stmt = conn.createStatement();

            String sql = "select empno, ename, sal, sal*12+ifnull(comm,0) annsal from emp where deptno=10";

            rs = stmt.executeQuery(sql);
            while(rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String sal = rs.getString("sal");
                //String annsal = rs.getString("annsal");
                String annsal = rs.getString(4);

                System.out.printf("%s %s %s %s%n",empno, ename, sal,annsal);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]:" + e.getMessage());
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) {}}
            if (stmt != null) { try { stmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }

    }
}
