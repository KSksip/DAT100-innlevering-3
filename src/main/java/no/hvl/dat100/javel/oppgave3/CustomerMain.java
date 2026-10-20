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

        System.out.println(customer.toString());
        /*
        TODO

         Write code that creates a Customer object and teste the methods implemented in the class

        */
    }
}
