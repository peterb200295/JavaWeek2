package nl.inholland.layers.resource;

import io.dropwizard.auth.Auth;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import nl.inholland.layers.model.User;

@Path("/")
public class LayeredResource
{
    private String defaultname;
    public LayeredResource()
    {        
    }
    
    public LayeredResource(String defaultname)
    {        
        this.defaultname = defaultname;
    }
    
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getName(@Auth User user){
        return String.format(
                "Authenticator: %s",
                user.getName());        
    }
}
