package messaging.client;

import java.io.IOException;
import java.net.Socket;

import messaging.client.view.InitView;

public class Client {
	public static void main(String[] args) {
		InitView initial = new InitView();
	}
	
	public static Socket connect() {
		Socket socket = null;
		try {socket = new Socket("localhost", 4765);}
		catch(IOException e) {System.out.println("Couldn't connect.");}		
		return socket;
	}
	
}
