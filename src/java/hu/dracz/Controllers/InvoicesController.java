/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.ws.WebServiceRef;
import org.tempuri.MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage;
import org.tempuri.MNBArfolyamServiceSoapImpl;
import org.w3c.dom.Document;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;


/**
 *
 * @author Isi
 */
@Named(value = "invoicesController")
@ManagedBean(name="InvoicesController")
@SessionScoped
public class InvoicesController implements Serializable {
   
    @EJB
    private InvoiceitemsFacadeLocal invoiceitemsFacade;

    @EJB
    private CustomersFacadeLocal customersFacade;
    
    @EJB
    private InvoicesFacadeLocal invoicesFacade;
    
    @WebServiceRef(wsdlLocation = "WEB-INF/wsdl/www.mnb.hu/arfolyamok.asmx.wsdl")
    private MNBArfolyamServiceSoapImpl service;
    
    private ArrayList<customerManager> customerList;
    private ArrayList<ItemManager> itemList;
    Customers customer;
    Customers selectCustomer;
    Invoices invoice;
    
    
    public InvoicesController() {
         customerList = new ArrayList<>();
         itemList = new ArrayList<>();
    }

    public ArrayList<ItemManager> getItemList() {
        return itemList;
    }
    public ArrayList<customerManager> getCustomerList() {
        return customerList;
    }
    
    public List<Invoices> findAll() {
        return this.invoicesFacade.findAll();
    }
    
    public void newInvoice(ArrayList<ItemManager> il, String dueDate, Customers cu) {
        customer = cu;
        try {
            // new invoice create
            Date issueDate = new Date(System.currentTimeMillis());
            String date = dueDate;
            Date due = new SimpleDateFormat("yyyy-MM-dd").parse(dueDate);
            System.out.println(due);
            invoice = new Invoices(issueDate,due,customer);
            invoicesFacade.create(invoice);
            // create ivoice items
            itemList = il;
            System.out.println(itemList);
            Iterator<ItemManager> items = itemList.iterator();
            while(items.hasNext()) {
                ItemManager im = new ItemManager();
                im = items.next();
                InvoiceItems ii = new InvoiceItems();
                ii = im.getItems();
                ii.setInvoice(invoicesFacade.find(invoice.getId()));
                ii.setId(null); 
                invoiceitemsFacade.create(ii);
            }
        } catch (ParseException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String detail(Invoices inv) {
       invoice = inv;
       return "invoiceDetail";
    }
    
    public String findCustomer(Customers c) {
        customerManager cm = new customerManager(customersFacade.find(c.getId()));
        customerList.add(cm);
        return "newInvoice";
    }

    private String getExchangeRates(java.lang.String startDate, java.lang.String endDate, java.lang.String currencyNames) throws MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage {
        // Note that the injected javax.xml.ws.Service reference as well as port objects are not thread safe.
        // If the calling of port operations may lead to race condition some synchronization is required.
        org.tempuri.MNBArfolyamServiceSoap port = service.getCustomBindingMNBArfolyamServiceSoap();
        return port.getExchangeRates(startDate, endDate, currencyNames);
    }
    
    public Date currentDate() {
         Date currentDate = new Date(System.currentTimeMillis());
         return currentDate;
    }
    
    public Double currency() {
        try {  
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");  
            String toDay = dateFormat.format(currentDate());  
            
            InputSource is = new InputSource(new StringReader(getExchangeRates("2020-08-26", "2020-08-26", "EUR")));
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(is);
            doc.getDocumentElement().normalize();
            Double eur = Double.parseDouble(doc.getElementsByTagName("Rate").item(0).getTextContent().replace(",","."));
            
            return eur;

        } catch (MNBArfolyamServiceSoapGetExchangeRatesStringFaultFaultMessage ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ParserConfigurationException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SAXException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(InvoicesController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return 0.0;
    }
}