/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.beans;

import com.sharecar.entidades.Login;
import com.sharecar.entidades.Usuario;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Jorge
 */
@Stateless
public class UsuarioFacade extends AbstractFacade<Usuario> {

    @PersistenceContext(unitName = "com.sharecar_ShareCar_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public UsuarioFacade() {
        super(Usuario.class);
    }

    public Usuario Login(String correo, String pass) {
        try {
            Query q = em.createNamedQuery("Login.login").
                    setParameter("correo", correo)
                    .setParameter("contrasena", pass);
            List<Login> listado = q.getResultList();

            if (!listado.isEmpty()) {
                for (Login login : listado) {
                    if (correo.equals(login.getCorreo()) && pass.equals(login.getContrasena())) {
                        Usuario user = this.findLogin(login.getIdLogin());
                        if (user != null) {
                            return user;
                        }
                    }
                }

            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

    public Usuario findLogin(int idLogin) {
        try {
            Query q = em.createNamedQuery("Usuario.findByIdLogin").
                    setParameter("idLogin", idLogin);
            List<Usuario> usuarios = q.getResultList();

            if (!usuarios.isEmpty()){
                return usuarios.get(0);
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

}
