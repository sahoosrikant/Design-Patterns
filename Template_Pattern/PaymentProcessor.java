package org.example.AbstractClass;

//Abstract Template Class
public abstract class PaymentProcessor {

    public final void processPayment(){
        validate();
        authenticate();
        pay();
        notifyUser();
    }

    protected abstract void validate();
    protected abstract void authenticate();
    protected abstract void pay();

    protected void notifyUser(){
        System.out.println("Payment notification Sent");
    };
}
