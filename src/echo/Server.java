package echo;

import java.io.IOException;

import javax.ws.rs.core.UriBuilder;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;

public class Server {
	
	
	public static void main(String[] args) throws IllegalArgumentException, IOException {
		
		HttpServer server = HttpServerFactory.create("http://localhost:9002/server");
		server.start();
		
		Client c = Client.create();
		
		WebResource wr = c.resource("http://localhost:9002/server/client/msg/" + UriBuilder.fromPath("Tabea ist").build());
		
		System.out.println(wr.get(String.class));
		
		server.stop(1);
		
	}

}
