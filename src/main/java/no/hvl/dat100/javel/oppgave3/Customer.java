package no.hvl.dat100.javel.oppgave3;

public class Customer {

    String name;
    String email;
    int customer_id;
    PowerAgreementType agreement;

    public Customer(String name, String email, int customer_id, PowerAgreementType agreement) {
        this.name = name;
        this.email = email;
        this.customer_id = customer_id;
        this.agreement = agreement; 
    }

    // SETTERS
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setCustomerId(int customer_id) {
        this.customer_id = customer_id;
    }

    public void setAgreement(PowerAgreementType agreement) {
        this.agreement = agreement;
    }

    // GETTERS
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public int getCustomerId() {
        return customer_id;
    }

    public PowerAgreementType getAgreement() {
        return agreement;
    }

    // TO STRING
    public String toString() {
        return String.format("""
        name: %s,
        email: %s,
        customer_id: %d,
        agreement: %s
        """,
            name,
            email,
            customer_id,
            agreement
        );
    }
}
