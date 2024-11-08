package com.exam5;

import java.io.*;
import java.net.Socket;

public class TCPClientEx01 {
    public static void main(String[] args) {
        Socket socket = null;

        BufferedWriter bw = null;
        BufferedReader br = null;

        try {
            System.out.println(" 서버와 연결을 시작합니다. ");

            socket = new Socket("localhost", 7777);
            System.out.println(" 서버와 연결 되었습니다. ");

            bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream(), "UTF-8"));
            br = new BufferedReader(new InputStreamReader(socket.getInputStream(), "UTF-8"));

            bw.write("안녕 소켓" + System.lineSeparator());
            bw.flush();

            System.out.println("[에코메시지]" + br.readLine());


        } catch (IOException e) {
            System.out.println("에러 : " + e.getMessage());
        } finally {
            if (bw != null) { try { bw.close(); } catch (IOException e) { }}
            if (br != null) { try { br.close(); } catch (IOException e) { }}
            if (socket != null) { try { socket.close(); } catch (IOException e) {}}
        }
    }
}
