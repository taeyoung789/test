package com.exam1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.Scanner;

public class Register {
    Scanner sc = new Scanner(System.in);

    public void register() {
        String url = "jdbc:mariadb://localhost:3306/memberlist";
        String user = "root";
        String password = "123456";

        Connection conn = null;
        Statement stmt = null;

        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(url, user, password);
            stmt = conn.createStatement();

            System.out.println("등록할 회원정보를 입력해주세요");

            System.out.print("▶▶ 이름: ");
            String name = sc.nextLine();

            System.out.print("▶▶ 연락처: ");
            String phone = sc.nextLine();

            System.out.print("▶▶ e-mail: ");
            String email = sc.nextLine();

            System.out.print("▶▶ 그룹: ");
            String group = sc.nextLine();

            System.out.print("▶▶ 생년월일: ");
            String birth = sc.nextLine();

            String regDate = LocalDate.now().toString();

            System.out.print("\n회원정보를 등록하시겠습니까(y/n)? ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("y")) {
                String sql = String.format(
                        "INSERT INTO user (name, phone, email, `group`, birth, reg_date) " +
                                "VALUES ('%s', '%s', '%s', '%s', '%s', '%s')",
                        name, phone, email, group, birth, regDate
                );

                int result = stmt.executeUpdate(sql);

                if (result > 0) {
                    System.out.println("회원정보를 정상적으로 등록하였습니다.");
                } else {
                    System.out.println("회원정보 등록에 실패했습니다.");
                }
            } else {
                System.out.println("회원정보 등록이 취소되었습니다.");
            }


        } catch (ClassNotFoundException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } finally {
            if (stmt != null) { try { stmt.close(); } catch (SQLException e) {} }
            if (conn != null) { try { conn.close(); } catch (SQLException e) {} }
        }
    }
}
