package messaging.server.packets;

import java.net.Socket;

public class JoinPacket extends Packet {

	public JoinPacket(Socket socket, String username) {
		super.socket = socket;
		super.username = username;
	}
	
}
