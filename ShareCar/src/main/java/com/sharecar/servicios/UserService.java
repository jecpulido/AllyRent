/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.servicios;

import com.sharecar.beans.LoginFacade;
import com.sharecar.beans.UsuarioFacade;
import com.sharecar.entidades.Login;
import com.sharecar.entidades.Usuario;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jorge
 */
@Path("User")
public class UserService {

    @EJB
    UsuarioFacade _user;

    @EJB
    LoginFacade _login;

    @POST
    @Path("/CreateUser")
    @Produces({MediaType.APPLICATION_JSON})
    @Consumes({MediaType.APPLICATION_JSON})
    public Usuario createUser(Usuario user) {
        try {
            if (user != null) {
                Login login = user.getIdLogin();
                if(login != null){
                    _login.create(login);
                }
                user.setIdLogin(login);

                _user.create(user);
            }
            
            return user;
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

    @POST
    @Path("/LoginUser")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Usuario LoginPost(Login login) {
        try {
            String correo = login.getCorreo();
            String password = login.getContrasena();
            Usuario user = _user.Login(correo, password);
            if (user != null) {
                return user;
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

}
