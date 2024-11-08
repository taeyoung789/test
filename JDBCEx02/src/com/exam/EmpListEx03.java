package com.exam;

import java.sql.*;


public class EmpListEx03 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        Connection conn = null;
        Statement stmt1 = null;
        Statement stmt2 = null;
        ResultSet rs = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url,user,password);
            stmt1 = conn.createStatement();

            String sql = "select * from emp where deptno=10";


            rs = stmt1.executeQuery(sql);
            while(rs.next()) {
                String empno = rs.getString("empno");
                String ename = rs.getString("ename");
                String job = rs.getString("job");
                String mgr = rs.getString("mgr");
                String hiredate = rs.getString("hiredate");
                String sal = rs.getString("sal");
                String comm = rs.getString("comm");
                String deptno = rs.getString("deptno");


                System.out.printf("%s %s %s %s %s %s %s %s%n",empno, ename, job, mgr, hiredate, sal, comm, deptno);
            }
        } catch (ClassNotFoundException e) {
            System.out.println("[에러]:" + e.getMessage());
        } catch (SQLException e) {
            System.out.println("[에러]:" + e.getMessage());
        } finally {
            if (rs != null) { try { rs.close(); } catch (SQLException e) {}}
            if (stmt1 != null) { try { stmt1.close(); } catch (SQLException e) {}}
            if (stmt2 != null) { try { stmt2.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }

    }
}
