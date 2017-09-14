/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.inholland.layers;

import com.hubspot.dropwizard.guice.GuiceBundle;
import nl.inholland.layers.persistence.MockDB;

/**
 *
 * @author MacBook
 */
public class LayeredApplication {
    private GuiceBundle<LayeredConfiguration> guiceBundle;

    public static void main(String[] args) throws Exception
    {
        MockDB.init();
    }
}
