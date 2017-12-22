import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;

public class Book {
	
	
	
	public static void main(String[] args)
	{
		//Create a client
		Client client = ClientBuilder.newClient();
		// set target for client
		WebTarget target = client.target("");
	}
}
