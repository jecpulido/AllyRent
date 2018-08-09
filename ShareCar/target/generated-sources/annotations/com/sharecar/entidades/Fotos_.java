package com.sharecar.entidades;

import com.sharecar.entidades.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Fotos.class)
public class Fotos_ { 

    public static volatile SingularAttribute<Fotos, Integer> idFoto;
    public static volatile SingularAttribute<Fotos, Date> fechaCarga;
    public static volatile SingularAttribute<Fotos, Vehiculo> idVehiculo;
    public static volatile SingularAttribute<Fotos, String> ruta;

}