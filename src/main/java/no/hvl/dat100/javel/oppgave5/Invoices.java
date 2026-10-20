package no.hvl.dat100.javel.oppgave5;

public class Invoices {

    public static void processInvoices(Invoice[] invoices) {
        System.out.println("==========================");
        for (Invoice invoice : invoices) {
            invoice.computeAmount();
            invoice.printInvoice();
            System.out.println("==========================");
        }
    }
}
