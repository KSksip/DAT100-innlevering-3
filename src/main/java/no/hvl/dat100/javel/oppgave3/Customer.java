package no.hvl.dat100.javel.oppgave3;

public class Customer {

    String name;
    String email;
    int customerId;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customerId, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customerId = customerId;
        this.agreement = agreement; 
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    // GETTERS
    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    public int getCustomerId() {
        return this.customerId;
    }

    public PowerAgreementType getAgreement() {
        return this.agreement;
    }

    // TO STRING
    public String toString() {
        return String.format("""
        name:       %s,
        email:      %s,
        customerId: %d,
        agreement:  %s"""
        ,
            name,
            email,
            customerId,
            agreement
        );
    }
}
