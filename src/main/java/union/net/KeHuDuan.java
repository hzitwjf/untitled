package union.net;


import java.io.*;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Administrator on 2016/8/11.
 */
public class KeHuDuan {
    public static void main(String[] args) {
        try {
            Scanner input=new Scanner(System.in);
            System.out.println("请输入用户名");
            String id=input.nextLine();
            System.out.println("请输入密码");
            String pwd=input.nextLine();
            //用带参构造方法传入id和密码
            UserDuiXiang user=new UserDuiXiang(id,pwd);
            Socket socket=new Socket("127.0.0.1",5858);
            System.out.println("对象正在输出");
            //再借助对象输出流来输出对象
            OutputStream out=socket.getOutputStream();
            ObjectOutputStream obj=new ObjectOutputStream(out);
            obj.writeObject(user);
            //接收服务器发过来的消息
            socket.shutdownOutput();
            InputStream i=socket.getInputStream();
            BufferedReader b=new BufferedReader(new InputStreamReader(i));
            String s=b.readLine();
            System.out.println(s);
            //关闭各种流
            i.close();
            b.close();
            obj.close();
            out.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
