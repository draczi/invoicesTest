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


@Named("itemsController")
@SessionScoped
public class InvoiceItemsController implements Serializable {
    private ArrayList<ItemManager> itemList;
    
    public InvoiceItemsController() {
        itemList = new ArrayList<>();
    }
    
    public ArrayList<ItemManager> getItemList() {
        return itemList;
    }
    
    public String addItemList(InvoiceItems item) {
     
        ItemManager im = new ItemManager(item);
        
                itemList.add(im);
     
        
        return "newInvoice";
    }

   
    
    
}
