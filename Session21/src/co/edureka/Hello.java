package co.edureka;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.servlet.ServletContainer;

// WebService

@Path("/hello")
public class Hello {

	// WebMethods
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String sayPlainHello(){
		String str = "Search the Candle rather than cursing the darkness !!";
		return str;
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHTMLHello(){
		String str = "<html><body><h3>Search the Candle rather than cursing the darkness !!</h3></body></html>";
		return str;
	}

	@GET
	@Produces(MediaType.TEXT_XML)
	//@POST
	public String sayXMLHello(){
		String str = "<?xml version='1.0' encosing='UTF-8'?><hello>Search the Candle rather than cursing the darkness !!</hello>";
		return str;
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String sayJSONHello(){
		String str = "{\"eid\":101,\"name\":\"John\"}";
		return str;
	}
	
}
