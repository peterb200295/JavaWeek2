package nl.inholland.layers;

import nl.inholland.layers.model.User;
import io.dropwizard.auth.Authenticator;
import io.dropwizard.auth.basic.BasicCredentials;

public class LayeredAuthenticator implements Authenticator<BasicCredentials, User>
{
}
