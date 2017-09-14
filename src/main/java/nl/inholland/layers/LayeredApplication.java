package nl.inholland.layers;

import com.hubspot.dropwizard.guice.GuiceBundle;
import nl.inholland.layers.persistence.MockDB;

public class LayeredApplication {
    private GuiceBundle<LayeredConfiguration> guiceBundle;

    public static void main(String[] args) throws Exception
    {
        MockDB.init();
    }
}
