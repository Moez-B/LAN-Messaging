package messaging.server.handlers;

import java.io.ObjectInputStream;

import messaging.server.Server;
import messaging.server.packets.JoinPacket;
import messaging.server.packets.Packet;

public class UserJoinEventHandler extends Handler implements Runnable {
	
	public UserJoinEventHandler(Server server, ObjectInputStream packetStream) {
		super.server = server;
		super.packetStream = packetStream;
	}
	
	public void userJoinedEvent() {
		System.out.println("User Joined");
		
	}
	
	@Override
	public void run() {
		Packet packet = null;
		while(true) {
			try{packet = (Packet)super.packetStream.readObject();} 
			catch(Exception e) {}
			
			if(packet instanceof JoinPacket) {
				System.out.println(packet.getUsername() + " has joined.");
			}
			else {
				//if packet is a message packet
			}
			try {Thread.sleep(100);}
			catch(InterruptedException e) {}
		}
		
	}
	
}
