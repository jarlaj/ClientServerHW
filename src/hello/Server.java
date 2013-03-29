package hello;

import java.io.IOException;

import javax.swing.JOptionPane;

import com.sun.jersey.api.container.httpserver.HttpServerFactory;
import com.sun.net.httpserver.HttpServer;


public class Server {

	public static void main() throws IllegalArgumentException, IOException {
		
		HttpServer server = HttpServerFactory.create("http://localhost:8080/rest");
		server.start();
		JOptionPane.showMessageDialog( null, "Ende" );
		server.stop(0);
		
	}
}
