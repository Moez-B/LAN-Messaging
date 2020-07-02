package messaging.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class IncomingTraffic extends Thread {

	private Server server;
	private ServerSocket socket;
	
	
	public IncomingTraffic(Server server, ServerSocket socket) {
		this.server = server;
		this.socket = socket;
	}
	
	@Override
	public void run() {
		Socket incoming = null;
		while(true) {
			try {
				incoming = socket.accept();	
			}
			catch(IOException e) {}
			catch(NullPointerException ee) {System.out.println("No connection.");}
			if(incoming != null) {
				this.server.sockets.add(incoming);
				incoming = null;
				System.out.println("got it");
			}
			try {Thread.sleep(250);}
			catch(InterruptedException e) {}
		}
		
	}
	
}
