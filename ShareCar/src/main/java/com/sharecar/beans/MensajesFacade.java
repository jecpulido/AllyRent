/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.beans;

import com.sharecar.entidades.Mensajes;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Jorge
 */
@Stateless
public class MensajesFacade extends AbstractFacade<Mensajes> {

    @PersistenceContext(unitName = "com.sharecar_ShareCar_war_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public MensajesFacade() {
        super(Mensajes.class);
    }
    
}
