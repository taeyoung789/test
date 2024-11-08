package com.exam4;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServerEx01 {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        Socket socket = null;

        // 클라이언트에서 보낸 메시지 받기
        BufferedReader br = null;
        // 클라이언트에 메시지 보내기
        BufferedWriter bw = null;


        try {
            serverSocket = new ServerSocket(7777);
            System.out.println("서버가 준비되었습니다.");

            // 클라이언트 대기
            socket = serverSocket.accept();
            System.out.println("클라이언트와 연결되었습니다.");

            br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));
            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));

            bw.write(br.readLine() + System.lineSeparator());

            bw.flush();

            System.out.println("전송 완료");

            //System.out.println("메시지 : " + br.readLine());

        } catch (IOException e) {
            System.out.println("에러" + e.getMessage());
        } finally {
            if (br != null) { try { br.close(); } catch(IOException e) {}}
            if (bw != null) { try { bw.close(); } catch(IOException e) {}}
            if (socket != null) { try { socket.close(); } catch (IOException e) {}}
            if (serverSocket != null) { try { serverSocket.close(); } catch (IOException e) {}}

        }
    }
}
