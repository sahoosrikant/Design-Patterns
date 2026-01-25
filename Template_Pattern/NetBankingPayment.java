package org.example.ConcreteClass;
//Concrete Implementations
import org.example.AbstractClass.PaymentProcessor;

public class NetBankingPayment extends PaymentProcessor {
    @Override
    protected void validate() {
        System.out.println("Validating bank credentials");
    }

    @Override
    protected void authenticate() {
        System.out.println("Authenticating via bank log in");
    }

    @Override
    protected void pay() {
        System.out.println("Processing net banking payment");
    }
}
