package GSNDemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {
	public static void main(String[] args) throws IOException{
		Socket server = null;
		try{
			String inputString;
			server = new Socket("127.0.0.1",4445);
			System.out.println("��������Ϣ");
			BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter os = new PrintWriter(server.getOutputStream());
			BufferedReader is = new BufferedReader(new InputStreamReader(server.getInputStream()));
			inputString = sin.readLine();
			while(inputString!=null&&inputString.trim().equals("quit")){
				os.println(inputString);
				os.flush();
				System.out.println("Client���͵���ϢΪ��"+inputString);
			 	System.out.println("Server���͵���ϢΪ��"+is.readLine());
				inputString = sin.readLine();
			 	
			}
			os.close();
			is.close();
			server.close();
			System.out.println("���������");
			}catch(UnknownHostException e){
				e.printStackTrace();
		}catch(IOException e){
			e.printStackTrace();
		}
	}
}