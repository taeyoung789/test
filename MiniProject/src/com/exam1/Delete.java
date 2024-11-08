package com.exam1;

import java.sql.*;
import java.util.Scanner;

public class Delete {
    Scanner sc = new Scanner(System.in);

    public void deleteUser() {
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

            System.out.print("삭제할 회원의 등록번호를 입력해주세요 ? ");
            String memberId = sc.nextLine();

            String query = "SELECT * FROM user WHERE id = '" + memberId + "'";
            rs = stmt.executeQuery(query);

            if (!rs.next()) {
                System.out.println("입력하신 회원등록번호에 해당하는 회원은 존재하지 않습니다.");
            } else {
                System.out.printf("\n[ %s ]님의 회원정보\n", memberId);
                String name = rs.getString("name");
                String phone = rs.getString("phone");
                String email = rs.getString("email");
                String group = rs.getString("group");
                String birth = rs.getString("birth");

                System.out.println("이름 : " + name);
                System.out.println("연락처 : " + phone);
                System.out.println("email : " + email);
                System.out.println("그룹 : " + group);
                System.out.println("생년월일 : " + birth);

                System.out.print("\n회원정보삭제를 계속하시겠습니까(y/n) ? ");
                String confirm = sc.nextLine();

                if (confirm.equalsIgnoreCase("y")) {
                    String deleteQuery = "DELETE FROM user WHERE id = '" + memberId + "'";
                    int result = stmt.executeUpdate(deleteQuery);

                    if (result > 0) {
                        System.out.println("회원정보를 정상적으로 삭제하였습니다.");
                    } else {
                        System.out.println("회원정보삭제에 실패했습니다.");
                    }
                } else {
                    System.out.println("회원정보 삭제가 취소되었습니다.");
                }
            }


        } catch (ClassNotFoundException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } finally {
            // 리소스 닫기
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
    }
}