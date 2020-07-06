package messaging.client;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		try {Socket socket = new Socket("localhost", 4765);}
		catch(IOException e) {System.out.println("Couldn't connect.");}
	}
}
