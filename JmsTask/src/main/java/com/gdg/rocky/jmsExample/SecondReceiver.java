package com.gdg.rocky.jmsExample;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.Session;
import javax.jms.TextMessage;
import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

public class SecondReceiver {
	
	private ConnectionFactory factory = null;
	private Connection connection = null;
	private Session session = null;
	private Destination destination = null;
	private MessageConsumer consumer = null;
	
	public SecondReceiver() {
		// TODO Auto-generated constructor stub
	}

	public void receiveMessage()
	{
		try 
		{
			factory = new ActiveMQConnectionFactory( ActiveMQConnection.DEFAULT_BROKER_URL );
			connection = factory.createConnection();
			connection = factory.createConnection();
			connection.start();
			session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
			destination = session.createQueue("SAMPLEQUEUE");
			consumer = session.createConsumer(destination);
			Message message = consumer.receive();

			if (message instanceof TextMessage) 
			{
				TextMessage text = (TextMessage) message;
				System.out.println("Message is : " + text.getText());
			}
		} 
		catch (JMSException e) 
		{
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
