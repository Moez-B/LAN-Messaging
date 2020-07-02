package messaging.server.handlers;

import java.net.Socket;

import messaging.server.Server;

public class UserJoinEventHandler extends Handler{
	
	public UserJoinEventHandler(Server server, Socket socket) {
		super.server = server;
		super.socket = socket;
	}
	
	public void userJoinedEvent() {
		System.out.println("User Joined");
	}
}
