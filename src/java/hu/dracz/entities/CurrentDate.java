/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.entities;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.faces.bean.ManagedBean;

/**
 *
 * @author Isi
 */
@ManagedBean(name="cdate")
public class CurrentDate {
   private String currentDate;
     public CurrentDate() {}
    public String getCurrentDate() {
        Date date = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        currentDate = dateFormat.format(date);
        return currentDate;
    }

    public void setCurrentDate(String currentDate) {
        this.currentDate = currentDate;
    }

   
  
    
}
