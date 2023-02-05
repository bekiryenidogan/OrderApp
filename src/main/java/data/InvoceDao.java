package data;

import entities.Invoice;

import java.util.List;

public interface InvoceDao {
    public List<Invoice> getInvoices();
    public List<Invoice> getOverAmountInvoices();
    public double getAvarageOverAmountInvoices();

}
