package hu.dracz.Controllers;

import hu.dracz.entities.InvoiceItems;
import hu.dracz.entities.ItemManager;
import java.io.Serializable;
import java.util.ArrayList;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

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
