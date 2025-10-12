public class UPIPayment implements PaymentStratergy{

    private String mobileNumber;

    public UPIPayment(String mobileNumber){
        this.mobileNumber = mobileNumber;
    }

    public void pay(double amount){
        System.out.println("This payment of value "+amount+" is done by UPI with number :"+ mobileNumber);
    }

}