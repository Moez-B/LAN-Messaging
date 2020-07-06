package messaging.server;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class IncomingTraffic extends Thread {

	private Server server;
		
	public IncomingTraffic(Server server, ServerSocket socket) {
		this.server = server;
	}
	
	@Override
	public void run() {
		Socket incoming = null;
		while(true) {
			try {
				incoming = this.server.server.accept();	
				System.out.println("got it");
			}
			catch(IOException e) {}
			catch(NullPointerException ee) {}
			
			if(incoming != null) {
				this.server.sockets.add(incoming);
				
				try{server.packets.add(new ObjectInputStream(incoming.getInputStream()));}
				catch(IOException e) {}
				
				incoming = null;
			}
			
			try {Thread.sleep(250);}
			catch(InterruptedException e) {}
		}
		
	}
	
}
