package no.hvl.dat100.javel.oppgave5;

import no.hvl.dat100.javel.oppgave3.Customer;
import no.hvl.dat100.javel.oppgave4.Customers;
import no.hvl.dat100.javel.oppgave3.PowerAgreementType;
import no.hvl.dat100.javel.oppgave2.MonthPowerData;
import no.hvl.dat100.javel.oppgave5.*;

public class InvoiceMain {

    public static void main(String[] args) {

        System.out.println("==============");
        System.out.println("OPPGAVE 5");
        System.out.println("==============");
        System.out.println();

        double[][][] powerUsage = {
            CustomerPowerUsageData.usage_month_customer1,
            CustomerPowerUsageData.usage_month_customer2,
            CustomerPowerUsageData.usage_month_customer3
        };

        Customer[] customerList = {
            new Customer(
                "John Doe",
                "JohnDoe@example.com",
                0,
                PowerAgreementType.POWERSUPPORT
            ),
            new Customer(
                "Jane Doe",
                "JaneDoe@example.com",
                1,
                PowerAgreementType.NORGESPRICE
            ),
            new Customer(
                "Ola Normann",
                "OlaNormann@eksempel.no",
                2,
                PowerAgreementType.SPOTPRICE
            )
        };

        //=======================
        // Implementasjon for Customers klassen under; 
        // bestemte meg for å ikke bruke det fordi det legger til unødvendig kluss.
        // det hadde vært nyttig å bruke klassen hvis jeg skulle trengt 
        // noen av funksjonene i den men det gjør jeg ikke i dette tilfellet.
        //========================
        /* Customers customers = new Customers(tmp.length); //endre navnet til variabelen på linje 24 til tmp
        for (Customer customer : tmp) {
            customers.addCustomer(customer);
        }

        Customer[] customerList = customers.getCustomers(); */

        System.out.println("TESTING INVOICE");
        System.out.println("==============");
        Invoice test = new Invoice(
            customerList[0], 
            "October", 
            powerUsage[0],
            MonthPowerData.powerprices_month
        );
        test.computeAmount();
        test.printInvoice();

        Invoice[] invoices = new Invoice[customerList.length];

        for (int i = 0; i < customerList.length; i++) {
            invoices[i] = new Invoice(
                customerList[i], 
                "October", 
                powerUsage[i], 
                MonthPowerData.powerprices_month
            );
        }

        System.out.println("==============");
        System.out.println("\nPRINTING INVOICES");
        Invoices.processInvoices(invoices);
    }
}
