package org.example.concreteState;

import org.example.contextClass.ATM;
import org.example.stateInterface.ATMState;

public class NoCashState implements ATMState {

    private ATM atm;

    public NoCashState(ATM atm){
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("ATM out of service");
    }

    @Override
    public void ejectCard() {
        System.out.println("No card inserted");
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("ATM out of service");
    }

    @Override
    public void withdrawCash(int amount) {
        System.out.println("ATM out of service");
    }
}
