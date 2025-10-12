public class CreditCardPayment implements PaymentStratergy{

    private String cardNumber;

    public CreditCardPayment(String cardNumber){
        this.cardNumber = cardNumber;
    }

    public void pay(double amount){
        System.out.println("This payment of value "+amount+"  is done by credit card with number :"+ cardNumber);
    }

}