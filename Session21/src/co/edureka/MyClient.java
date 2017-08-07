package co.edureka;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriBuilder;

import org.glassfish.jersey.client.ClientConfig;

public class MyClient {

	public static void main(String[] args) {
		
		ClientConfig config = new ClientConfig();
		Client client = ClientBuilder.newClient(config); // REST Client, which shall sent the HTTP Request to WebService.
		
		WebTarget target = client.target(UriBuilder.fromUri("http://localhost:8080/Session21").build());
		
		// Consuming the WebService
		String plain = target.path("rest").path("hello").request().accept(MediaType.TEXT_PLAIN).get(String.class);
		String html = target.path("rest").path("hello").request().accept(MediaType.TEXT_HTML).get(String.class);
		String xml = target.path("rest").path("hello").request().accept(MediaType.TEXT_XML).get(String.class);
		String json = target.path("rest").path("hello").request().accept(MediaType.APPLICATION_JSON).get(String.class);
		
		
		
		System.out.println(plain);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(html);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(xml);
		System.out.println("----------------------------------------------------------------------");
		System.out.println(json);
		System.out.println("----------------------------------------------------------------------");
	}

}
