package com.sharecar.entidades;

import com.sharecar.entidades.ReportesPK;
import com.sharecar.entidades.Usuario;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Reportes.class)
public class Reportes_ { 

    public static volatile SingularAttribute<Reportes, Boolean> estado;
    public static volatile SingularAttribute<Reportes, String> causa;
    public static volatile SingularAttribute<Reportes, Usuario> usuario;
    public static volatile SingularAttribute<Reportes, Usuario> usuario1;
    public static volatile SingularAttribute<Reportes, ReportesPK> reportesPK;
    public static volatile SingularAttribute<Reportes, Date> fechaReporte;

}