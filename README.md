# OrderApp
OrderApp Task for Definex Spring Practicum


## Requests For The Task
<ul>
  <li>Tüm müşterileri listeleyin </li>
  <li>İçerisinde ‘C’ harfi olan müşterileri listeleyin</li>
  <li>Haziran ayında kayıt olan müşterilerin faturalarınının toplam tutarını listeleyin</li>
  <li>Sistemdeki tüm faturaları listeleyin</li>
  <li>Sistemdeki 1500TL üstündeki faturaları listeleyin</li>
  <li>Sistemdeki 1500TL üstündeki faturaları ortalamasını hesaplayın</li>
  <li>Sistemdeki 500TL altındaki faturalara sahip müşterilerin isimleri listeleyin</li>
  <li>Haziran ayını faturalarını ortalaması 750 altı olan firmalarının hangi sektörde olduğunu listeleyen kodu yazın.</li>
</ul>

## Output

```
Customer list
Name: Bekir Surname: Yeni Registration Date: 2023-02-05 Sector: IT Invoices: [Invoice(amount=200.0, date=2023-02-05), Invoice(amount=200.0, date=2023-02-05)]
Name: Kaan Surname: Aksoy Registration Date: 2020-06-12 Sector: Manufacturing Invoices: [Invoice(amount=2000.0, date=2020-02-15)]
Name: Goker Surname: Bora Registration Date: 2021-06-22 Sector: Retail Invoices: [Invoice(amount=750.0, date=2023-02-05), Invoice(amount=1500.0, date=2022-06-04), Invoice(amount=100.0, date=2023-02-05)]
Name: Cem Surname: Aksoy Registration Date: 2020-06-12 Sector: Manufacturing Invoices: [Invoice(amount=2000.0, date=2020-02-15)]
Name: Eren Surname: Ay Registration Date: 2023-02-05 Sector: Retail Invoices: [Invoice(amount=750.0, date=2020-06-15), Invoice(amount=100.0, date=2023-02-05)]
Invoice list
 Amount: 1000.0 Date: 2023-02-05
 Amount: 220.0 Date: 2023-02-05
 Amount: 1600.0 Date: 2023-02-05
List of customer with the letter 'C' in it:[Customer(name=Cem, surname=Aksoy, registrationDate=2020-06-12, sector=Manufacturing, invoices=[Invoice(amount=2000.0, date=2020-02-15)])]
List of the total amount of invoices of customers who registered in June:6350.0
List of 1500TL invoices in the system:[Invoice(amount=1600.0, date=2023-02-05)]
Average of invoices over 1500TL in the system:1600.0
The list of names of customers with invoices under 500TL in the system:[Bekir, Goker, Eren]
The list of companies with an average of less than 750 invoices for June is in which sector:{Manufacturing=[Customer(name=Kaan, surname=Aksoy, registrationDate=2020-06-12, sector=Manufacturing, invoices=[Invoice(amount=2000.0, date=2020-02-15)]), Customer(name=Cem, surname=Aksoy, registrationDate=2020-06-12, sector=Manufacturing, invoices=[Invoice(amount=2000.0, date=2020-02-15)])], IT=[Customer(name=Bekir, surname=Yeni, registrationDate=2023-02-05, sector=IT, invoices=[Invoice(amount=200.0, date=2023-02-05), Invoice(amount=200.0, date=2023-02-05)])]}


```
