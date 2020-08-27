/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.entities;

/**
 *
 * @author Isi
 */
public class customerManager {
    
    private Customers customer;

    public customerManager(Customers customer) {
        this.customer = customer;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
    
    
}
