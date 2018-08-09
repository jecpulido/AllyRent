/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.servicios;

import com.sharecar.beans.DatamasterFacade;
import com.sharecar.beans.DatatypeFacade;
import com.sharecar.entidades.Datamaster;
import com.sharecar.entidades.Datatype;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jorge
 */
@Path("Parameters")
public class GeneralService {

    @EJB
    DatatypeFacade _Datatype;

    @EJB
    DatamasterFacade _Datamaster;

    @GET
    @Path("/FindType/{idParameter}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Datatype> GetSearchList(@PathParam("idParameter") int idParameter) {
        try {
            List<Datatype> lista = _Datatype.ListarTipos(idParameter);
            if (lista != null) {
                return lista;
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

    @GET
    @Path("/ParametersMaster")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Datamaster> ListParameters() {
        try {
            List<Datamaster> lista = _Datamaster.findAll();
            if (lista != null) {
                return lista;
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }

    @GET
    @Path("/ParametersType")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Datatype> ListAllParameters() {
        try {
            List<Datatype> lista = _Datatype.findAll();
            if (lista != null) {
                return lista;
            }
        } catch (Exception e) {
            System.out.println("" + e.getMessage());
        }
        return null;
    }
    
    
}
