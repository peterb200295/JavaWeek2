   package nl.inholland.layers.model;

import java.security.Principal;

public class User implements Principal
{
    private String name = "";
    
    private String password = "";
    
    public User(String name, String password)
    {
        this.name = name;
        this.password = password;
    }

    @Override
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}