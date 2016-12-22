package GSNDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class ChattingDemoServer {
	static int num = 1;
	public static void main(String[] args){
		ServerSocket serverSocket = null;
		Socket client = null;
		while(true){
			try{
				serverSocket = new ServerSocket(4445);
			}catch(Exception e){
				System.out.println("Error:"+e);
				System.exit(-1);
			}
			try{
				client = serverSocket.accept();
			}catch(Exception e){
				System.out.println("��������ʧ�ܣ�");
				System.exit(-1);
			}
			System.out.println("Client["+ChattingDemoServer.num+"]��¼��������");
			ServerThread st = new ServerThread(client);
			Thread t = new Thread(st);
			t.start();
			try{
				serverSocket.close();
			}catch(IOException e){
				System.out.println("�ر�ʧ�ܣ�");
			}
			num++;
		}
	}
}
class ServerThread implements Runnable{
	private Socket client;
	public ServerThread(Socket client){
		this.client = client;
	}
	public void run(){
		try{
			BufferedReader is = new BufferedReader(new InputStreamReader(client.getInputStream()));
			PrintWriter os = new PrintWriter(client.getOutputStream());
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Client:"+is.readLine());
			String inputString = sin.readLine();
			while(inputString!=null && !inputString.trim().equals("quit")){
				os.println(inputString);
				os.flush();
				System.out.println("Server������ϢΪ��"+inputString);
				System.out.println("Client���͵���ϢΪ��"+is.readLine());
				inputString = sin.readLine();
			}
			os.close();
			is.close();
			client.close();
			System.out.println("�������");
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}







