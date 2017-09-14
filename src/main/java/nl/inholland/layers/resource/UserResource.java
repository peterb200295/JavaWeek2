package nl.inholland.layers.resource;

import com.google.inject.Inject;
import java.util.List;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import nl.inholland.layers.model.User;
import nl.inholland.layers.presentation.model.UserPresenter;
import nl.inholland.layers.presentation.model.UserView;
import nl.inholland.layers.service.UserService;
import static org.glassfish.jersey.uri.UriComponent.Type.PATH;

@Path("/users")
@Consumes(MediaType.APPLICATION_JSON)        
@Produces(MediaType.APPLICATION_JSON)   

public class UserResource extends BaseResource {
    private final UserService userService;
    private final UserPresenter userPresenter;
    
    @Inject 
    public UserResource(UserService userService, UserPresenter userPresenter) {
        this.userService = userService;
        this.userPresenter = userPresenter;
    }
    
    @GET 
    public List<UserView> getAll() {
        List<User> users = userService.getAll();
        
        return userPresenter.present(users);
    }
    
    @GET
    @PATH("/userId")
    public UserView get (@PathParam("userId") String userId){
        User user = userService.get(userId);
        return userPresenter.present(user);
    }

}
