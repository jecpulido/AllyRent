package com.sharecar.entidades;

import com.sharecar.entidades.Ciudad;
import com.sharecar.entidades.Comentario;
import com.sharecar.entidades.Contrato;
import com.sharecar.entidades.Datatype;
import com.sharecar.entidades.Login;
import com.sharecar.entidades.Mensajes;
import com.sharecar.entidades.Publicacion;
import com.sharecar.entidades.Relaciones;
import com.sharecar.entidades.Reportes;
import com.sharecar.entidades.Rol;
import com.sharecar.entidades.Solicitud;
import com.sharecar.entidades.Vehiculo;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Usuario.class)
public class Usuario_ { 

    public static volatile CollectionAttribute<Usuario, Mensajes> mensajesCollection1;
    public static volatile SingularAttribute<Usuario, Rol> idRol;
    public static volatile CollectionAttribute<Usuario, Relaciones> relacionesCollection1;
    public static volatile SingularAttribute<Usuario, Date> fechaNacimiento;
    public static volatile CollectionAttribute<Usuario, Solicitud> solicitudCollection;
    public static volatile SingularAttribute<Usuario, Integer> idUsuario;
    public static volatile CollectionAttribute<Usuario, Reportes> reportesCollection1;
    public static volatile CollectionAttribute<Usuario, Reportes> reportesCollection;
    public static volatile SingularAttribute<Usuario, String> nombre;
    public static volatile SingularAttribute<Usuario, Ciudad> idCiudad;
    public static volatile CollectionAttribute<Usuario, Vehiculo> vehiculoCollection;
    public static volatile CollectionAttribute<Usuario, Publicacion> publicacionCollection;
    public static volatile SingularAttribute<Usuario, Datatype> idSexo;
    public static volatile CollectionAttribute<Usuario, Relaciones> relacionesCollection;
    public static volatile CollectionAttribute<Usuario, Mensajes> mensajesCollection;
    public static volatile SingularAttribute<Usuario, String> apellido;
    public static volatile SingularAttribute<Usuario, Datatype> idTipoDocumento;
    public static volatile SingularAttribute<Usuario, Login> idLogin;
    public static volatile SingularAttribute<Usuario, String> telefono;
    public static volatile SingularAttribute<Usuario, String> rutaFoto;
    public static volatile SingularAttribute<Usuario, String> dni;
    public static volatile CollectionAttribute<Usuario, Contrato> contratoCollection;
    public static volatile CollectionAttribute<Usuario, Comentario> comentarioCollection;
    public static volatile CollectionAttribute<Usuario, Contrato> contratoCollection1;

}