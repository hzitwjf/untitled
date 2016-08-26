package union.net;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * Created by Administrator on 2016/8/11.
 */
public class JieShou extends Thread{
    @Override
    public void run(){
        DatagramSocket socket=null;
        try {
             socket=new DatagramSocket(5858);
            while (true){

                byte [] b=new byte[1024];
                //用来接收数据报文
                DatagramPacket packet=new DatagramPacket(b,b.length);
                socket.receive(packet);
                //读取收到的字节数组
                byte [] msg=packet.getData();
                String s=new String(msg,"UTF-8");
                System.out.println(packet.getAddress()+"说："+s);
            }
        }catch (Exception ex){
            System.out.println("程序出现异常，正在退出");
            ex.printStackTrace();
        }finally{
            socket.close();
        }
    }
}
