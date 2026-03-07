package org.example.contextClass;

import org.example.concreteState.AuthenticatedState;
import org.example.concreteState.HasCardState;
import org.example.concreteState.NoCardState;
import org.example.concreteState.NoCashState;
import org.example.stateInterface.ATMState;

public class ATM {
    private ATMState noCardState;
    private ATMState hasCardState;
    private ATMState authenticatedState;
    private ATMState noCashState;

    private ATMState currentState;

    private int cash = 1000;


    public ATM(){
        noCardState = new NoCardState(this);
        hasCardState = new HasCardState(this);
        authenticatedState = new AuthenticatedState(this);
        noCashState = new NoCashState(this);

        currentState = cash > 0 ? noCardState : noCashState;
    }

    public void insertCard(){
        currentState.insertCard();
    }

    public void ejectCard(){
        currentState.ejectCard();
    }

    public void enterPin(int pin){
        currentState.enterPin(pin);
    }

    public void withdrawCash(int amount){
        currentState.withdrawCash(amount);
    }


    //Getter and Setters
    public void setState(ATMState state){
        this.currentState = state;
    }

    public ATMState getNoCardState() {
        return noCardState;
    }

    public ATMState getHasCardState() {
        return hasCardState;
    }

    public ATMState getAuthenticatedState() {
        return authenticatedState;
    }

    public ATMState getNoCashState() {
        return noCashState;
    }

    public int getCash(){
        return cash;
    }

    public int deductCash(int amount){
        cash = cash - amount;
        return cash;
    }
}
