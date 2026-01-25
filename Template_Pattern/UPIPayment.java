package org.example.ConcreteClass;
//Concrete Implementations
import org.example.AbstractClass.PaymentProcessor;

public class UPIPayment extends PaymentProcessor {

    @Override
    protected void validate() {
        System.out.println("Validating the UPI Id");
    }

    @Override
    protected void authenticate() {
        System.out.println("Authenticating via UPI pin");
    }

    @Override
    protected void pay() {
        System.out.println("Processing UPI payment");
    }
}
