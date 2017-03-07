package cn.edu.nju.socket;

/**
 * 客户端
 */
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class SocketClient {
	public static void main(String []args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		SocketWrapper socket = new SocketWrapper(new Socket("localhost", 8888));
		try {
			System.out.println("已经连接上服务器，现在可以输入数据开始通信了");
			String sendMsg = scanner.nextLine();
			socket.writeLine(sendMsg);
			String recivedMsg = socket.readLine();
			while(!"close".equals(recivedMsg)) {
				System.out.println("===[服务器返回]===>" + recivedMsg);
				sendMsg = scanner.nextLine();
				socket.writeLine(sendMsg);
				recivedMsg = socket.readLine();
			}
			System.out.println("我是客户端，结束了");
		} finally {
			if(socket != null)
				socket.close();
		}
	}
}
