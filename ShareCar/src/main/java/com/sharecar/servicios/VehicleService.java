/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sharecar.servicios;

import com.sharecar.beans.MarcaFacade;
import com.sharecar.beans.ModeloFacade;
import com.sharecar.beans.VehiculoFacade;
import com.sharecar.entidades.Login;
import com.sharecar.entidades.Marca;
import com.sharecar.entidades.Modelo;
import com.sharecar.entidades.Usuario;
import com.sharecar.entidades.Vehiculo;
import java.util.List;
import javax.ejb.EJB;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author Jorge
 */

@Path("Vehicle")
public class VehicleService {

    @EJB
    VehiculoFacade _vehicleFacade;

    @EJB
    MarcaFacade _marcaFacade;
    
    @EJB
    ModeloFacade _modeloFacade;

    @GET
    @Path("/Marca")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Marca> ListAllMarca() {
        List<Marca> listaMarca = _marcaFacade.findAll();
        return listaMarca;
    }
    
    @GET
    @Path("/Modelo/{idMarca}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Modelo> findModelByMarca(@PathParam("idMarca")int idMarca) {
        List<Modelo> listaModelo = _modeloFacade.findModelByMarca(idMarca);
        return listaModelo;
    }
    
    @POST
    @Path("/CreateVehicle")
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Vehiculo CreateVehicle(Vehiculo vehiculo){        
        _vehicleFacade.create(vehiculo);
        return vehiculo;
    }
    
}
