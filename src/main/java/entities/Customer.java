package entities;

import lombok.Data;
import lombok.NoArgsConstructor;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

    @Data
    @NoArgsConstructor
    public class Customer {
       private String name ;
       private String surname;
       private LocalDate registrationDate;
       private String sector;
       private List<Invoice> invoices;

       public Customer(String name,String surname,LocalDate registrationDate, String sector,Invoice... invoices){
           this.name =name;
           this.surname=surname;
           this.registrationDate = registrationDate;
           this.sector = sector;
           this.invoices = new ArrayList<>(Arrays.asList(invoices));
       }
    }

