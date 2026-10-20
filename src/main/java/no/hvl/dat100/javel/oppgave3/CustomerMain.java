package no.hvl.dat100.javel.oppgave3;

import no.hvl.dat100.javel.oppgave3.Customer;

public class CustomerMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 3");
        System.out.println("==============");
        System.out.println();
        
        Customer customer = new Customer(
            "John Doe",
            "JohnDoe@example.com",
            0,
            PowerAgreementType.SPOTPRICE
        );

        customer.setName("Jane Doe");
        customer.setEmail("JaneDoe@example.com");
        customer.setCustomerId(1);
        customer.setAgreement(PowerAgreementType.NORGESPRICE);

        System.out.println("\nCUSTOMER IDENTIFIER");
        System.out.println(customer.getCustomerId());
 
        System.out.println("\nCUSTOMER EMAIL");
        System.out.println(customer.getEmail());
        
        System.out.println("\nCUSTOMER NAME");
        System.out.println(customer.getName());
        
        System.out.println("\nCUSTOMER AGREEMENT");
        System.out.println(customer.getAgreement());

        System.out.println("\nFULL CUSTOMER DETAILS");
        System.out.println(customer.toString());
    }
}
