/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nl.inholland.layers.resource;

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
}
