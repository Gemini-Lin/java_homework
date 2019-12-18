import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class myServer {

    /**
     * 创建服务器的方法，等待客户机的连接并进行通信
     */

    public void setServer(int port) {
        try {
            ServerSocket ss = new ServerSocket(port);
            System.out.println("服务器创建成功,端口号是" + ss.getLocalPort() + "等待连接……");

            Socket client = ss.accept();
            System.out.println("连接成功，连接的客户机是：" + client.getPort());

            OutputStream out = client.getOutputStream();
            InputStream ins = client.getInputStream();

            String s = "Welcome to my chatting room!\r\n"; // 取得组成这个字符串的字节
            byte[] data = s.getBytes();
            out.write(data);// 用输出对象发送！
            out.flush();// 强制输出

            String msg = readString(ins);//获得输入
            while (!"bye".equals(msg)) {//如果不是"bye"就继续等待读取
                System.out.println("The Client Say:" + msg);
                s = "The Server receive:" + msg + "\r\n";
                data = s.getBytes();
                out.write(data);
                out.flush();
                msg = readString(ins);//调用readString()读取一个字符串
            }
            //给客户机发一个欢迎下次再来的提示
            s = "Hello,See you next time!\r\n";
            data = s.getBytes();
            out.write(data);
            out.flush();

            client.close();// 关闭与客户机的连接
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * 读取一个字符串的方法
     */

    private String readString(InputStream ins) throws IOException {
        StringBuffer msg = new StringBuffer();// 创建一个字符串缓冲区
        char c = 0;
        while (c != '\r') {// 每遇到一个换行，就是一句话
            int i = ins.read();// 读取客户机发过来的一个字节
            c = (char) i;// 把输入的字节转换为一个char
            msg.append(c);// 将读到的字符加到字符缓冲区中
        }
        String inputS = msg.toString().trim();// 将读到的BufferString转换为字符串，并调用trim()去掉尾部的空格
        return inputS;// 返回得到的字符串
    }

    public static void main(String[] args) {
        myServer ms = new myServer();
        ms.setServer(6666);
    }

}