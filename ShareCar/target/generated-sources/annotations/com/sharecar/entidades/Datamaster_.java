package com.sharecar.entidades;

import com.sharecar.entidades.Datatype;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2018-08-08T20:57:22")
@StaticMetamodel(Datamaster.class)
public class Datamaster_ { 

    public static volatile SingularAttribute<Datamaster, String> nombreDataMaster;
    public static volatile SingularAttribute<Datamaster, String> descripcionDataMaster;
    public static volatile SingularAttribute<Datamaster, Integer> idDataMaster;
    public static volatile CollectionAttribute<Datamaster, Datatype> datatypeCollection;

}