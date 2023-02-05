package business;

import data.InvoceDao;
import entities.Invoice;

import java.util.List;

public class InvoiceManager {
    InvoceDao invoiceDao;

    public InvoiceManager(InvoceDao invoiceDao){
        this.invoiceDao = invoiceDao;
    }

    public List<Invoice> getInvoices(){
        return invoiceDao.getInvoices();
    }

    public List<Invoice> getOverAmountInvoices(){
        return invoiceDao.getOverAmountInvoices();
    }

    public  double getAvarageOverAmountInvoices(){
        return invoiceDao.getAvarageOverAmountInvoices();
    }
}
