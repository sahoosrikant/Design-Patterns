package org.example;

import org.example.contextClass.ATM;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard();
        atm.enterPin(1234);
        atm.withdrawCash(500);
    }
}