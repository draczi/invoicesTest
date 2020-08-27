package hu.dracz.Controllers;

import hu.dracz.beans.CustomersFacadeLocal;
import hu.dracz.entities.Customers;
import hu.dracz.entities.customerManager;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;


/**
 *
 * @author Isi
 */


@Named("customersController")
@SessionScoped
public class CustomersItemsController implements Serializable {

    @EJB
    private CustomersFacadeLocal customersFacade;
    private ArrayList<customerManager> customerList;
    
    private Customers customer;

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }
    
    public CustomersItemsController() {
        customerList = new ArrayList<>();
    }
    
    public void newCustomer(Customers customer) {
        customersFacade.create(customer);
    }
    
    public List<Customers> allCustomers() {
        return this.customersFacade.findAll();
    }
    
    public ArrayList<customerManager> getCustomerList() {
        return customerList;
    }
    
    public String findCustomer(Customers c) {
        customer = customersFacade.find(c.getId());
        return "newInvoice";
    }

   
    
    
}
