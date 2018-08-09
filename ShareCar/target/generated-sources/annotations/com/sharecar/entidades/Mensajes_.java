package com.sharecar.entidades;

import com.sharecar.entidades.MensajesPK;
import com.sharecar.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Mensajes.class)
public class Mensajes_ { 

    public static volatile SingularAttribute<Mensajes, MensajesPK> mensajesPK;
    public static volatile SingularAttribute<Mensajes, Boolean> estado;
    public static volatile SingularAttribute<Mensajes, Usuario> usuario;
    public static volatile SingularAttribute<Mensajes, Usuario> usuario1;
    public static volatile SingularAttribute<Mensajes, String> mensaje;
    public static volatile SingularAttribute<Mensajes, Date> fechaEnvia;

}