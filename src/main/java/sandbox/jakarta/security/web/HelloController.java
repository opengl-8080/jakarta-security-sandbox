package sandbox.jakarta.security.web;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;

@Path("hello")
public class HelloController {

    @GET
    public String hello() {
        return "Hello World!!";
    }
}
