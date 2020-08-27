/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.beans;

import hu.dracz.entities.Invoices;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Isi
 */
@Local
public interface InvoicesFacadeLocal {

    void create(Invoices invoices);

    void edit(Invoices invoices);

    void remove(Invoices invoices);

    Invoices find(Object id);

    List<Invoices> findAll();

    List<Invoices> findRange(int[] range);

    int count();
    
}
