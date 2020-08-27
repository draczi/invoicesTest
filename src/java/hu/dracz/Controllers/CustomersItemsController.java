package hu.dracz.Controllers;

import hu.dracz.beans.CustomersFacadeLocal;
import hu.dracz.beans.InvoiceitemsFacadeLocal;
import hu.dracz.beans.InvoicesFacadeLocal;
import hu.dracz.entities.Customers;
import hu.dracz.entities.Invoices;
import hu.dracz.entities.InvoiceItems;
import hu.dracz.entities.ItemManager;
import hu.dracz.entities.customerManager;
import java.io.IOException;
import java.io.Serializable;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.faces.bean.RequestScoped;
import javax.persistence.EntityManager;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceRef;
import org.tempuri.MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage;
import org.tempuri.MNBArfolyamServiceSoapImpl;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

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
    
    public ArrayList<customerManager> getCustomerList() {
        return customerList;
    }
    
        public String findCustomer(Customers c) {
         
            customer = customersFacade.find(c.getId());
//         customerManager cm = new customerManager(customersFacade.find(c.getId()));
//
//         customerList.add(cm);
       
         return "newInvoice";
    }

   
    
    
}
