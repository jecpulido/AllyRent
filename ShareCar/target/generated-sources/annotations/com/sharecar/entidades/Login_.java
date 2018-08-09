package com.sharecar.entidades;

import com.sharecar.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Login.class)
public class Login_ { 

    public static volatile SingularAttribute<Login, Date> ultimaConexion;
    public static volatile SingularAttribute<Login, Boolean> estado;
    public static volatile SingularAttribute<Login, String> correo;
    public static volatile SingularAttribute<Login, String> contrasena;
    public static volatile SingularAttribute<Login, Integer> idLogin;
    public static volatile CollectionAttribute<Login, Usuario> usuarioCollection;

}