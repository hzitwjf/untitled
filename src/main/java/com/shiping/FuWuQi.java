package com.shiping;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/10.
 */
public class FuWuQi {
    public static void main(String[] args) {
        try {
            while (true){
            ServerSocket serverSocket=new ServerSocket(5858);//创建服务器对象
            System.out.println("服务器已启动");
            Socket socket=serverSocket.accept();//接收客户端输入的数据
            InputStream inputStream=socket.getInputStream();
            byte [] b=new byte[1024];
            int length=0;
            while (( length=inputStream.read(b))!= -1){
               // for (int i = 0; i <length ; i++) {
                //System.out.println(b[i]);
                    String s=new String(b,0,length);
                    System.out.println(s);
               // }
            }
            inputStream.close();
            socket.close();
            serverSocket.close();
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
