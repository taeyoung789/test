package com.exam1;

import java.sql.*;
import java.util.Scanner;

public class Edit {
    Scanner sc = new Scanner(System.in);

    public void updateUser() {
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

            System.out.print("수정할 회원의 등록번호를 입력해주세요 ? ");
            String memberId = sc.nextLine();

            // 회원 정보 조회
            String query = "SELECT * FROM user WHERE id = '" + memberId + "'";
            rs = stmt.executeQuery(query);

            if (!rs.next()) {
                System.out.println("입력하신 회원등록번호에 해당하는 회원은 존재하지 않습니다.");
            } else {
                System.out.printf("\n[ %s ]님의 회원정보\n", memberId);
                String currentName = rs.getString("name");
                String currentPhone = rs.getString("phone");
                String currentEmail = rs.getString("email");
                String currentGroup = rs.getString("group");
                String currentBirth = rs.getString("birth");

                System.out.println("이름 : " + currentName);
                System.out.println("연락처 : " + currentPhone);
                System.out.println("이쪽지 : " + currentEmail);
                System.out.println("그룹 : " + currentGroup);
                System.out.println("생년월일 : " + currentBirth);

                System.out.print("\n회원정보수정을 계속하시겠습니까(y/n) ? ");
                String proceed = sc.nextLine();

                if (proceed.equalsIgnoreCase("y")) {
                    System.out.println("\n** 입력하지 않으면 기존의 정보가 그대로 유지됩니다.");

                    System.out.print("▶▶ 수정할 이름 : ");
                    String newName = sc.nextLine();
                    if (newName.isEmpty()) newName = currentName;

                    System.out.print("▶▶ 수정할 연락처 : ");
                    String newPhone = sc.nextLine();
                    if (newPhone.isEmpty()) newPhone = currentPhone;

                    System.out.print("▶▶ 수정할 이쪽지 : ");
                    String newEmail = sc.nextLine();
                    if (newEmail.isEmpty()) newEmail = currentEmail;

                    System.out.print("▶▶ 수정할 그룹 : ");
                    String newGroup = sc.nextLine();
                    if (newGroup.isEmpty()) newGroup = currentGroup;

                    System.out.print("▶▶ 수정할 생년월일 : ");
                    String newBirth = sc.nextLine();
                    if (newBirth.isEmpty()) newBirth = currentBirth;

                    System.out.print("\n회원정보를 수정하시겠습니까(y/n) ? ");
                    String confirm = sc.nextLine();

                    if (confirm.equalsIgnoreCase("y")) {
                        String updateQuery = String.format(
                                "UPDATE user SET name='%s', phone='%s', email='%s', group='%s', birth='%s' WHERE id='%s'",
                                newName, newPhone, newEmail, newGroup, newBirth, memberId
                        );

                        int result = stmt.executeUpdate(updateQuery);

                        if (result > 0) {
                            System.out.println("회원정보를 정상적으로 수정하였습니다.");
                        } else {
                            System.out.println("회원정보수정에 실패했습니다.");
                        }
                    } else {
                        System.out.println("회원정보 수정이 취소되었습니다.");
                    }
                } else {
                    System.out.println("회원정보 수정이 취소되었습니다.");
                }
            }



        } catch (ClassNotFoundException e) {
            System.out.println("에러: " + e.getMessage());
        } catch (SQLException e) {
            System.out.println("에러: " + e.getMessage());
        } finally {
            if (rs != null) try { rs.close(); } catch (SQLException e) {}
            if (stmt != null) try { stmt.close(); } catch (SQLException e) {}
            if (conn != null) try { conn.close(); } catch (SQLException e) {}
        }
    }
}
