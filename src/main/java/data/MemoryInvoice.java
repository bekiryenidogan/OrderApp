package data;

import entities.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MemoryInvoice implements InvoceDao{

    List<Invoice> invoices;
    public MemoryInvoice(){
        invoices = new ArrayList<Invoice>(){{
            add(new Invoice(1000, LocalDate.now()));
            add(new Invoice(220,LocalDate.now()));
            add(new Invoice(1600, LocalDate.now()));
        }};
    }
    @Override
    public List<Invoice> getInvoices() {
        return this.invoices;
    }

    @Override
    public List<Invoice> getOverAmountInvoices() {
        return invoices.stream().filter(invoice -> invoice.getAmount()>1500).collect(Collectors.toList());
    }

    @Override
    public double getAvarageOverAmountInvoices() {
        return invoices.stream().filter(invoice -> invoice.getAmount()>1500).mapToDouble(Invoice::getAmount).average().orElse(0);
    }
}
