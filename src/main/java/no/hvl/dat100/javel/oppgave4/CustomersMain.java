package no.hvl.dat100.javel.oppgave4;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;

public class CustomersMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 4");
        System.out.println("==============");
        System.out.println();

        Customers customers = new Customers(2);

        customers.addCustomer(
            new Customer(
                "John Doe", 
                "JohnDoe@example.com", 
                0, 
                PowerAgreementType.SPOTPRICE
            )
        );

        System.out.println("\nNON NULL ENTRIES");
        System.out.println(customers.countNonNull());
        
        System.out.println("\nCUSTOMERS");
        for(Customer customer : customers.getCustomers()){
            System.out.println(customer.toString());
        }
        
        System.out.println("\nREMOVED CUSTOMER");
        System.out.println(customers.removeCustomer(0));
    }
}
