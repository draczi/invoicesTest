/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.beans;

import hu.dracz.entities.InvoiceItems;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Isi
 */
@Local
public interface InvoiceitemsFacadeLocal {

    void create(InvoiceItems invoiceitems);

    void edit(InvoiceItems invoiceitems);

    void remove(InvoiceItems invoiceitems);

    InvoiceItems find(Object id);

    List<InvoiceItems> findAll();

    List<InvoiceItems> findRange(int[] range);

    int count();
    
}
