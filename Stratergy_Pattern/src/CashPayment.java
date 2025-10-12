public class CashPayment implements PaymentStratergy{

    public void pay(double amount){
        System.out.println("This payment is done by cash of value "+ amount);
    }
}