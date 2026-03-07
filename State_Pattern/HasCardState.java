package org.example.concreteState;

import org.example.contextClass.ATM;
import org.example.stateInterface.ATMState;

public class HasCardState implements ATMState {

    private ATM atm;
    private final int correct_pin = 1234;

    public HasCardState(ATM atm){
        this.atm = atm;
    }
    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected.");
        atm.setState(atm.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        if(pin == correct_pin){
            System.out.println("PIN is correct");
            atm.setState(atm.getAuthenticatedState());
        }else {
            System.out.println("PIN is wrong");
            ejectCard();
        }
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("Enter the PIN first");
    }
}
