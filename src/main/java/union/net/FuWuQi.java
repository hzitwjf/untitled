package union.net;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/11.
 */
public class FuWuQi{
    public static void main(String[] args)  {
        ServerSocket server=null;
        Socket socket=null;
        try {
            server=new ServerSocket(5858);

            while(true){
                socket=server.accept();
                Thread t=new TiGao(socket);
                t.start();
                socket.close();
            }
            } catch (IOException e1) {
            e1.printStackTrace();
        }finally {
            try {
                server.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
