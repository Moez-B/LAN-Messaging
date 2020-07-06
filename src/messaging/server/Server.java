package messaging.server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import messaging.client.Client;
import messaging.server.handlers.UserJoinEventHandler;

public class Server implements Runnable {

	public List<Socket> sockets = new ArrayList<>();
	public int connections;
	public ServerSocket server;
	public IncomingTraffic in;
	
	public Server() {
		try {
			this.server = new ServerSocket(4765);
		}
		catch(IOException e) {}
		this.connections = 0;
		this.in = new IncomingTraffic(this, server);
	}
	
	@Override
	public void run() {
		this.in.start();
		while(true) {
			System.out.println("Current Connections: " + sockets.size());
			try {
				Thread.sleep(250);	
			}
			catch(InterruptedException e) {}
			
			//user join event
			if(sockets.size() != connections) {
				++this.connections;
				new UserJoinEventHandler(this,sockets.get(connections-1)).userJoinedEvent();
			}
			else{}
		}
		
	}
	
	public static void main(String[] args) {
		Server server = new Server();
		new Thread(server).start();
	}
	
}
