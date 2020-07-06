package messaging.client;

import java.io.IOException;
import java.net.Socket;

import messaging.client.view.InitView;

public class Client {
	
	public Socket socket = null;
	
	public static void main(String[] args) {
		InitView initial = new InitView();
	}
	
	public Client() {}
	
	public void connect() {
		try {
			this.socket = new Socket("localhost", 4765);
			System.out.println("Client request sent.");
		}
		catch(IOException e) {System.out.println("Couldn't connect.");}		
	}
	
}
