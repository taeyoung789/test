package com.exam1;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String menuInput = "";


        MemberList memberList = new MemberList();
        Register register = new Register();
        Edit edit = new Edit();
        Delete delete = new Delete();
        System.out.println( "                           회원 관리 프로그램" );

        whileLoop:
        while ( true ) {
            System.out.println("========================================================================");
            System.out.println();
            System.out.println( "1. 회원정보목록" );
            System.out.println( "2. 회원정보등록" );
            System.out.println( "3. 회원정보수정" );
            System.out.println( "4. 회원정보삭제" );
            System.out.println();
            System.out.println( "5. 쪽지 보내기" );
            System.out.println();
            System.out.println( "6. 종료" );
            System.out.println();
            System.out.println("========================================================================");
            System.out.println();
            System.out.print( "메뉴를 입력하세요 : " );

            menuInput = scanner.nextLine();

            switch( menuInput ) {
                case "1":
                    System.out.println();
                    System.out.println( "회원정보목록" );
                    memberList.display();
                    System.out.println();
                    break;

                case "2":
                    System.out.println();
                    System.out.println( "회원정보등록" );
                    register.register();
                    System.out.println();
                    break;
                case "3":
                    System.out.println();
                    System.out.println( "회원정보수정" );
                    edit.updateUser();
                    System.out.println();
                    break;
                case "4":
                    System.out.println();
                    System.out.println( "회원정보삭제" );
                    delete.deleteUser();
                    System.out.println();
                    break;
                case "5":
                    System.out.println();
                    System.out.println( "쪽지 보내기" );
                    System.out.println();
                    break;
                case "6":
                    scanner.close();
                    break whileLoop;
                default:
                    System.out.println();
                    System.out.println( "잘못된 값을 입력하셨습니다." );
                    System.out.println( "입력은 1~5, 6 을 입력해주세요." );
                    System.out.println();
                    break;
            }
        }
        System.out.println();
        System.out.println( "시스템을 종료합니다." );
        System.out.println();
    }
}