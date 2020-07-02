package messaging.client;

import java.io.IOException;
import java.net.Socket;

public class Client {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			public void run() {
				try {Thread.sleep(500);}
				catch(InterruptedException e) {}
				try {Socket socket = new Socket("localhost", 4765);}
				catch(IOException e) {System.out.println("Couldn't connect.");}
				System.out.println("Connection attempted.");
			}
		}).start();
	}
}
