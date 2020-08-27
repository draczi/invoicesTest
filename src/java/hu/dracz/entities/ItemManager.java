/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.entities;

import java.io.Serializable;


public class ItemManager implements Serializable {

    private InvoiceItems items;
    
    public ItemManager() {
        
    }
    
    public ItemManager(InvoiceItems items) {
        this.items = items;
    }

    public InvoiceItems getItems() {
        return items;
    }

    public void setItems(InvoiceItems items) {
        this.items = items;
    }
 

}