package hu.dracz.entities;

import hu.dracz.entities.Invoices;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2020-08-27T12:37:55")
@StaticMetamodel(InvoiceItems.class)
public class InvoiceItems_ { 

    public static volatile SingularAttribute<InvoiceItems, Integer> unitPrice;
    public static volatile SingularAttribute<InvoiceItems, String> itemName;
    public static volatile SingularAttribute<InvoiceItems, Integer> quantity;
    public static volatile SingularAttribute<InvoiceItems, Integer> id;
    public static volatile SingularAttribute<InvoiceItems, Invoices> invoice;

}