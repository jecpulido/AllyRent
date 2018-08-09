package com.sharecar.entidades;

import com.sharecar.entidades.Vehiculo;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Tarifa.class)
public class Tarifa_ { 

    public static volatile SingularAttribute<Tarifa, Float> porHora;
    public static volatile SingularAttribute<Tarifa, Float> porDia;
    public static volatile SingularAttribute<Tarifa, Integer> idTarifa;
    public static volatile CollectionAttribute<Tarifa, Vehiculo> vehiculoCollection;

}