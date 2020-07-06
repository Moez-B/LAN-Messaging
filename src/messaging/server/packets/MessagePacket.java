package messaging.server.packets;

import java.net.Socket;

public class MessagePacket extends Packet {
	
	public String message;
	
	public MessagePacket(Socket socket, String username, String message) {
		super.socket = socket;
		super.username = username;
		this.message = message;
	}
	
}
