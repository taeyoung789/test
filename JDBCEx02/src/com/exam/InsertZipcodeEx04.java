// delete from zipcode;
// select count(*) from zipcode; 한 뒤에 진행

package com.exam;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class InsertZipcodeEx04 {
    public static void main(String[] args) {
        String url = "jdbc:mariadb://localhost:3306/sample";
        String user = "testuser";
        String password = "123456";

        BufferedReader br = null;

        Connection conn = null;
        PreparedStatement pstmt = null;

        try {
            Class.forName( "org.mariadb.jdbc.Driver" );
            conn = DriverManager.getConnection( url, user, password );

            String sql = String.format("insert into zipcode values (?,?,?,?,?,?,?)");
            pstmt = conn.createStatement(sql);

            br = new BufferedReader(new FileReader("./zipcode_seoul_utf8_type2.csv"));
            String line = "";
            while((line = br.readLine()) != null){
                //System.out.println(line);
                String[] addresses = line.split(",");

                pstmt.setString(1, addresses[0]);
                pstmt.setString(2, addresses[1]);
                pstmt.setString(3, addresses[2]);
                pstmt.setString(4, addresses[3]);
                pstmt.setString(5, addresses[4]);
                pstmt.setString(6, addresses[5]);
                pstmt.setString(7, addresses[6]);

                pstmt.executeUpdate(sql);
            }
            System.out.println("복구 완료");
        } catch (IOException e) {
            System.out.println("[에러]: " + e.getMessage());
        }catch (ClassNotFoundException e) {
            System.out.println("[에러]: " + e.getMessage());
        }catch(SQLException e) {
            System.out.println("[에러]: " + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch (IOException e) {}}
            if (pstmt != null) { try { pstmt.close(); } catch (SQLException e) {}}
            if (conn != null) { try { conn.close(); } catch (SQLException e) {}}
        }

    }
}
