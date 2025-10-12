public class PaymentContext{
    public PaymentStratergy stratergy;

    public void setStratergy(PaymentStratergy stratergy){
        this.stratergy = stratergy;
    }

    public void execute(double amount){
        if(stratergy == null){
            System.out.println("No payment method is selected.");
        }
        stratergy.pay(amount);
    }
}