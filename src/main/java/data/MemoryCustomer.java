package data;

import entities.Customer;
import entities.Invoice;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MemoryCustomer implements CustomerDao{


    List <Customer> customers;
    public MemoryCustomer(){
        customers = new ArrayList<Customer>(){{
            add(new Customer("Bekir","Yeni",LocalDate.now(),"IT",new Invoice(200,LocalDate.now()),new
                    Invoice(200, LocalDate.now())));
            add(new Customer("Kaan","Aksoy",LocalDate.of(2020,6,12),"Manufacturing",new Invoice(2000,LocalDate.of(2020,2,15))));
            add(new Customer("Goker","Bora",LocalDate.of(2021,6,22),"Retail",new Invoice(750,LocalDate.now()),new Invoice(1500,LocalDate.of(2022,6,4)),new Invoice(100,LocalDate.now())));
            add(new Customer("Cem","Aksoy",LocalDate.of(2020,6,12),"Manufacturing",new Invoice(2000,LocalDate.of(2020,2,15))));

        }};
    }
    @Override
    public void add(Customer customer) {
        customers.add(customer);
    }

    @Override
    public List<Customer> getCustomers() {
        return this.customers;
    }

    @Override
    public List<Customer> getCustomerWithC() {
        return customers.stream().filter(customer -> customer.getName().startsWith("C")).collect(Collectors.toList());
    }

    @Override
    public double getCustomerInJuneTotalInvoice() {
        return customers.stream()
                .filter(customer -> customer
                        .getRegistrationDate()
                        .getMonthValue()==6)
                .flatMap(customer->customer.getInvoices()
                        .stream()).mapToDouble(Invoice::getAmount).sum();
    }

    @Override
    public List<String> getNameOverInvoices() {
        return customers.stream().filter(customer -> customer
                                                    .getInvoices()
                                                    .stream().anyMatch(invoice -> invoice.getAmount() <500))
                                                    .map(Customer::getName).collect(Collectors.toList());
    }

    @Override
    public Map<String, List<Customer>> getSectorName() {
        return customers.stream().
                filter(customer -> customer.getInvoices().stream().
                        filter(b->b.getDate().getMonthValue()==6).
                        mapToDouble(Invoice::getAmount).
                        average().orElse(0)<750)
                .collect(Collectors.groupingBy(Customer::getSector));
    }
}
