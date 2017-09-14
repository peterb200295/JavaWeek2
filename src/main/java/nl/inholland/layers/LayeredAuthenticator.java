package nl.inholland.layers;

import nl.inholland.layers.model.User;
import java.util.Optional;
import io.dropwizard.auth.AuthenticationException;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

public class LayeredAuthenticator implements Authenticator<BasicCredentials, User>
{
    @Override
    public Optional<User> authenticate(BasicCredentials credentials) throws AuthenticationException
    {
        User user = new User(credentials.getUsername(), credentials.getPassword());
        
        User userFromDB = new User("nelleke", "test");
        
        if (!user.getName().equals(userFromDB.getName()))
        {
            return Optional.empty();
        }
        
        if (user.getPassword().equals(userFromDB.getPassword()))
        {
            return Optional.of(user);
        }
        
        return Optional.empty();
    }
}
