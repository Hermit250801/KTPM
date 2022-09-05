package View;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.MessageProducer;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.swing.BorderFactory;
import javax.swing.JFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Properties;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.apache.log4j.BasicConfigurator;

import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;

public class ChatView extends JFrame {
	private JTextArea textArea;
	private JPanel panel1;
	private JPanel panel;
	private JTextArea textArea_1;

	public ChatView() throws NamingException, JMSException {
		getContentPane().setLayout(new BorderLayout(0, 0));

		panel = new JPanel();
		getContentPane().add(panel, BorderLayout.CENTER);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setSize(600, 500);
		this.setLocationRelativeTo(null);
		this.setResizable(false);

		panel.setBorder(BorderFactory.createTitledBorder("Tèo chát chít"));
		panel.setLayout(new BorderLayout(0, 0));

		textArea_1 = new JTextArea();
		textArea_1.setTabSize(15);
		textArea_1.setBackground(new Color(255, 255, 255));
		textArea_1.setForeground(new Color(0, 0, 0));
		textArea_1.setEditable(false);
		panel.add(textArea_1);

		panel1 = new JPanel();
		panel1.setSize(new Dimension(100, 306));
		getContentPane().add(panel1, BorderLayout.SOUTH);
		panel1.setLayout(new BorderLayout(0, 0));

		textArea = new JTextArea();
		textArea.setRows(2);
		panel1.add(textArea, BorderLayout.CENTER);

		JButton btnNewButton = new JButton("Send");
		panel1.add(btnNewButton, BorderLayout.EAST);

		JLabel lblNewLabel = new JLabel("Enter text");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setSize(new Dimension(100, 0));
		panel1.add(lblNewLabel, BorderLayout.WEST);

		// thiết lập môi trường cho JMS logging
		BasicConfigurator.configure();
		// thiết lập môi trường cho JJNDI
		Properties settings = new Properties();
		settings.setProperty(Context.INITIAL_CONTEXT_FACTORY, "org.apache.activemq.jndi.ActiveMQInitialContextFactory");
		settings.setProperty(Context.PROVIDER_URL, "tcp://localhost:61616");
		// tạo context
		Context ctx = new InitialContext(settings);
		// lookup JMS connection factory
		Object obj = ctx.lookup("TopicConnectionFactory");
		ConnectionFactory factory = (ConnectionFactory) obj;
		// tạo connection
		final Connection con = factory.createConnection("admin", "admin");
		// nối đến MOM
		con.start();
		// tạo session
		final Session session = con.createSession(/* transaction */false, /* ACK */Session.AUTO_ACKNOWLEDGE);
		final Destination sendUser = (Destination) ctx.lookup("dynamicTopics/knight");
		final Destination receiveUser = (Destination) ctx.lookup("dynamicTopics/knight2");
		
		MessageConsumer receiver = session.createConsumer(sendUser);
		//receiver.receive();//blocked method
		//Cho receiver lắng nghe trên queue, chừng có message thì notify
		receiver.setMessageListener(new MessageListener() {
		//có message đến queue, phương thức này được thực thi
					public void onMessage(Message msg) {// msg là message nhận được
						try {
							if (msg instanceof TextMessage) {
								TextMessage tm = (TextMessage) msg;
								String txt = tm.getText();
								textArea_1.append("Nhận được: " + txt + "\n");
								System.out.println("XML= " + txt);
								msg.acknowledge();// gửi tín hiệu ack
							}
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});

		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				MessageProducer producer = null;
				try {
					producer = session.createProducer(sendUser);
				} catch (JMSException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				// Tạo 1 message
				Message msg = null;
				try {
					msg = session.createTextMessage(textArea.getText());
				} catch (JMSException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				try {
					producer.send(msg);
					textArea_1.append(textArea.getText() + "\n");
					textArea.setText("");
					
				} catch (JMSException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
				System.out.println("Finished...");
			}
		});
	}

}
