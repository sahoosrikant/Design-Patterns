package org.example.ConcreteClass;
//Concrete Implementations
import org.example.AbstractClass.PaymentProcessor;

public class CreditCardPayment extends PaymentProcessor {
    @Override
    protected void validate() {
        System.out.println("Validating the credit card details");
    }

    @Override
    protected void authenticate() {
        System.out.println("Authenticating via OTP");
    }

    @Override
    protected void pay() {
        System.out.println("Processing credit card payment");
    }
}
