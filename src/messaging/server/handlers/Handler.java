package messaging.server.handlers;

import java.io.ObjectInputStream;

import messaging.server.Server;

public abstract class Handler {
	public Server server;
	public ObjectInputStream packetStream;
}
