package hu.dracz.entities;

import hu.dracz.entities.Customers;
import hu.dracz.entities.InvoiceItems;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-27T12:37:55")
@StaticMetamodel(Invoices.class)
public class Invoices_ { 

    public static volatile CollectionAttribute<Invoices, InvoiceItems> invoiceitemsCollection;
    public static volatile SingularAttribute<Invoices, Date> dueDate;
    public static volatile SingularAttribute<Invoices, String> comment;
    public static volatile SingularAttribute<Invoices, Integer> id;
    public static volatile SingularAttribute<Invoices, Date> issueDate;
    public static volatile SingularAttribute<Invoices, Customers> customer;

}