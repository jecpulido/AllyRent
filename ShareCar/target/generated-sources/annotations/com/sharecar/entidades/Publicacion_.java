package com.sharecar.entidades;

import com.sharecar.entidades.Datatype;
import com.sharecar.entidades.Solicitud;
import com.sharecar.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Publicacion.class)
public class Publicacion_ { 

    public static volatile SingularAttribute<Publicacion, Date> fechaInicio;
    public static volatile CollectionAttribute<Publicacion, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<Publicacion, Usuario> idUsuario;
    public static volatile SingularAttribute<Publicacion, Datatype> idTipoPublicacion;
    public static volatile SingularAttribute<Publicacion, Date> fechaPublicacion;
    public static volatile SingularAttribute<Publicacion, Integer> idPublicacion;
    public static volatile SingularAttribute<Publicacion, Date> fechaFin;
    public static volatile SingularAttribute<Publicacion, String> publicacion;

}