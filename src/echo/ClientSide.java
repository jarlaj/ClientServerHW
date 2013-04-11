package echo;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/client")
public class ClientSide {

	@GET
	@Path("/msg/{msg}")
	@Produces(MediaType.TEXT_PLAIN)
	public String send(@PathParam("msg") String msg) {
		return msg;
	}

}
