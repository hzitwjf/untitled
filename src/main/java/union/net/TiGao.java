package union.net;


import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * Created by Administrator on 2016/8/11.
 */
public class TiGao extends Thread{
private Socket socket;
    public TiGao(Socket socket){
        this.socket=socket;
    }
    public  void run() {
        InputStream i=null;
        OutputStream outputStream=null;
        ObjectInputStream obj=null;

        try {
            i=socket.getInputStream();
            obj=new ObjectInputStream(i);
            UserDuiXiang o=(UserDuiXiang)obj.readObject();

            //给用户返还消息
            String msg="";
            if(o.getUserId().equals("hzit") && o.getPwd().equals("123")){
                msg="OK";
            }else{
                msg="Error";
            }
            socket.shutdownInput();
            outputStream=socket.getOutputStream();
            outputStream.write(msg.getBytes());
            obj.close();
            outputStream.close();
            socket.close();
            i.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        }
}
