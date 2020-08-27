/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.beans;

import hu.dracz.entities.InvoiceItems;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Isi
 */
@Stateless
public class InvoiceitemsFacade extends AbstractFacade<InvoiceItems> implements InvoiceitemsFacadeLocal {

    @PersistenceContext(unitName = "WebApplicationPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public InvoiceitemsFacade() {
        super(InvoiceItems.class);
    }
    
}
