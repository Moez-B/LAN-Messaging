package messaging.client.view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.Socket;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import messaging.client.Client;

public class InitView extends JFrame implements ActionListener {
	
	JTextField nameField = new JTextField("Username",5);
	JButton cont = new JButton("Continue");
	
	public InitView() {
		this.setTitle("Enter Info");
	    JPanel main = new JPanel();
	    main.setLayout(new BoxLayout(main,BoxLayout.PAGE_AXIS));
	    
	    main.add(new JLabel("Please enter your username:"));
	    main.add(this.nameField);
	    main.add(this.cont);
	    this.cont.addActionListener(this);
	    
	    this.setContentPane(main);
	    //this.setPreferredSize(new Dimension(450,400));
	    this.pack();
	    this.setVisible(true);
	    this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		if(event.getSource() == this.cont && this.nameField.getText() != "") {
			Socket clientSocket = Client.connect();
		}
	}
	
}
