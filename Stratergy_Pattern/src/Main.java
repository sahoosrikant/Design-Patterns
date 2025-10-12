public class Main{
    public static void main(String[] args){
        PaymentContext paymentContext =  new PaymentContext();

        //Credit Card Payment
        paymentContext.setStratergy(new CreditCardPayment("321456798"));
        paymentContext.execute(300.00);

        //UPI Payment
        paymentContext.setStratergy(new UPIPayment("998754263"));
        paymentContext.execute(400.00);

        //Cash Payment
        paymentContext.setStratergy(new CashPayment());
        paymentContext.execute(400.00);

    }
}