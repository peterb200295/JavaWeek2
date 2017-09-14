/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.inholland.layers.resource;

import java.util.List;
import javax.inject.Inject;
import javax.ws.rs.GET;
import nl.inholland.layers.model.User;
import nl.inholland.layers.presentation.model.UserView;

/**
 *
 * @author MacBook
 */
public class UserResource extends BaseResource{
    private final UserService userService;
    private final UserPresenter userPresenter;
    
    @Inject
    public UserResource(UserService userService, UserPresenter userPresenter){
        this.userService = userService;
        this.userPresenter = userPresenter;
    }
    
    @GET
    public List < UserView > getAll(){
        List<User> users = userService.getAll();
        
        return userPresenter.present(users);
    }
}
