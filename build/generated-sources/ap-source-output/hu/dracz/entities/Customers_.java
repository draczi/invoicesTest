package hu.dracz.entities;

import hu.dracz.entities.Invoices;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-27T10:02:24")
@StaticMetamodel(Customers.class)
public class Customers_ { 

    public static volatile SingularAttribute<Customers, String> zipCode;
    public static volatile SingularAttribute<Customers, String> country;
    public static volatile SingularAttribute<Customers, String> address;
    public static volatile SingularAttribute<Customers, String> city;
    public static volatile SingularAttribute<Customers, String> name;
    public static volatile SingularAttribute<Customers, Long> id;
    public static volatile CollectionAttribute<Customers, Invoices> invoicesCollection;

}