package com.sharecar.entidades;

import com.sharecar.entidades.Comentario;
import com.sharecar.entidades.Contrato;
import com.sharecar.entidades.Datatype;
import com.sharecar.entidades.Fotos;
import com.sharecar.entidades.Modelo;
import com.sharecar.entidades.Tarifa;
import com.sharecar.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:21")
@StaticMetamodel(Vehiculo.class)
public class Vehiculo_ { 

    public static volatile SingularAttribute<Vehiculo, Datatype> idTipoVehiculo;
    public static volatile SingularAttribute<Vehiculo, Integer> km;
    public static volatile SingularAttribute<Vehiculo, Integer> idVehiculo;
    public static volatile SingularAttribute<Vehiculo, Datatype> idTransmision;
    public static volatile SingularAttribute<Vehiculo, Usuario> idUsuario;
    public static volatile SingularAttribute<Vehiculo, Boolean> isPlacaPar;
    public static volatile CollectionAttribute<Vehiculo, Fotos> fotosCollection;
    public static volatile SingularAttribute<Vehiculo, Tarifa> idTarifa;
    public static volatile SingularAttribute<Vehiculo, Datatype> idCombustible;
    public static volatile SingularAttribute<Vehiculo, Modelo> idModelo;
    public static volatile SingularAttribute<Vehiculo, Date> año;
    public static volatile CollectionAttribute<Vehiculo, Contrato> contratoCollection;
    public static volatile CollectionAttribute<Vehiculo, Comentario> comentarioCollection;
    public static volatile SingularAttribute<Vehiculo, String> placa;

}