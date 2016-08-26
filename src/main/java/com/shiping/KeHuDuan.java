package com.shiping;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/10.
 */
public class KeHuDuan {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("192.168.0.174",8989);
            System.out.println("对象正在输出");
            OutputStream out=socket.getOutputStream();
            out.write("德玛西亚".getBytes());
            out.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
