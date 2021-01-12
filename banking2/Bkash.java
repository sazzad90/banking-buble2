package banking2;

public class Bkash extends Account{
    final double cashOutCharge=18.5;
    private String accountNumber;
    public Bkash(String name,String number,double amount,String pin){
        super(name, amount,pin);
        this.accountNumber=number;
    }
    public Bkash(String name,String number,double amount){
        super(name, amount);
        this.accountNumber=number;
    }
    public Bkash(){
        super();
    }

    @Override
    public void cashIn(double amount) {
        if(amount<=25000)
        super.cashIn(amount);
        else
            System.out.println("Sorry.Cash in limit exceeded :(");
    }

    @Override
    public void cashOut(double amount, String myPin) {
        if (amount <= 25000) {
            super.cashOut(amount, myPin);
            balance = balance - ((amount * cashOutCharge) / 1000);
        } else
            System.out.println("Sorry.Cash out limit exceeded :(");
    }

}
