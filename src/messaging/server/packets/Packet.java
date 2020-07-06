package messaging.server.packets;

import java.net.Socket;

public abstract class Packet {
	public Socket socket;
	public String username;
}
