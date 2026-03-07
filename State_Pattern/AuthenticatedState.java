package org.example.concreteState;

import org.example.contextClass.ATM;
import org.example.stateInterface.ATMState;

public class AuthenticatedState implements ATMState {

    private ATM atm;

    public AuthenticatedState(ATM atm){
        this.atm = atm;
    }
    @Override
    public void insertCard() {
        System.out.println("Transaction already in process");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card ejected");
        atm.setState(atm.getNoCardState());
    }

    @Override
    public void enterPin(int pin) {
        System.out.println("PIN is already entered");
    }

    @Override
    public void withdrawCash(int amount) {
        int remain_cash = atm.getCash()-amount;
        if(atm.getCash() < 0){
            System.out.println("Insufficient cash");
            ejectCard();
        }else{
            atm.deductCash(amount);
            System.out.println("Collect cash amd remaining balance :" + atm.getCash());
            ejectCard();
        }
    }
}
