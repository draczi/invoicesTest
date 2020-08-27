/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hu.dracz.entities;

import java.io.Serializable;
import java.util.Date;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.ws.rs.BeanParam;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Isi
 */
@Entity
@Table(name = "invoices", catalog = "invoices", schema = "")
@XmlRootElement
@ManagedBean(name="Invoices")
public class Invoices implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "invoice")
    private Collection<InvoiceItems> invoiceitemsCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id", nullable = false)
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "issueDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date issueDate;
    @Basic(optional = false)
    @NotNull
    @Column(name = "dueDate", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date dueDate;
    @Size(max = 255)
    @Column(name = "comment", length = 255)
    private String comment;
    @JoinColumn(name = "customer", referencedColumnName = "id", nullable = false)
    @ManyToOne(optional = false)
    private Customers customer;
   

    public Invoices() {
    }

    public Invoices(Integer id) {
        this.id = id;
    }

    public Invoices(Integer id, Date issueDate, Date dueDate) {
        this.id = id;
        this.issueDate = issueDate;
        this.dueDate = dueDate;
    }
    
    public Invoices(Date issueDate, Date dueDate, Customers customer) {
        this.issueDate = issueDate;
        this.dueDate = dueDate;
        this.customer = customer;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getDueDate() {
        return dueDate;
    }

    public void setDueDate(Date dueDate) {
        this.dueDate = dueDate;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Invoices)) {
            return false;
        }
        Invoices other = (Invoices) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "hu.dracz.entities.Invoices[ id=" + id + " ]";
    }

    @XmlTransient
    public Collection<InvoiceItems> getInvoiceitemsCollection() {
        return invoiceitemsCollection;
    }

    public void setInvoiceitemsCollection(Collection<InvoiceItems> invoiceitemsCollection) {
        this.invoiceitemsCollection = invoiceitemsCollection;
    }

    public void getDueDate(Date due) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
