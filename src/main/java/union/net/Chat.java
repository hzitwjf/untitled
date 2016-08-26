package union.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/11.
 */
public class Chat {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("欢迎来到自制版聊天软件");
        //接收线程专门接收消息
        Thread r=new JieShou();
        r.start();
        try{
            System.out.println("请输入聊天内容");
            while (true){
            String shuo=input.next();
            //创建一个socket对象用来发数据
            DatagramSocket socket=new DatagramSocket();
            InetAddress benji= InetAddress.getByName("192.168.0.112");
            DatagramPacket packet=new DatagramPacket(
                    shuo.getBytes(),
                    shuo.getBytes().length,
                    benji,
                    8888);
            //发送消息
            socket.send(packet);
            socket.close();
        }
    }catch (Exception ex){
            System.out.println("程序出现异常，正在退出");
            ex.printStackTrace();
        }
    }
}
