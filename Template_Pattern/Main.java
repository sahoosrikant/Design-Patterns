package org.example;

import org.example.AbstractClass.PaymentProcessor;
import org.example.ConcreteClass.CreditCardPayment;
import org.example.ConcreteClass.NetBankingPayment;
import org.example.ConcreteClass.UPIPayment;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        PaymentProcessor payment1 = new CreditCardPayment();

        payment1.processPayment();
        System.out.println("----------");

        PaymentProcessor payment2 = new NetBankingPayment();

        payment2.processPayment();
        System.out.println("----------");

        PaymentProcessor payment3 = new UPIPayment();

        payment3.processPayment();
    }
}