package messaging.server.handlers;

import java.net.Socket;

import messaging.server.Server;

public abstract class Handler {
	public Server server;
	public Socket socket;
}
