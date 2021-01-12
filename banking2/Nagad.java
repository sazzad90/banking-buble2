package banking2;

public class Nagad extends Account{
    final double cashOutCharge=9.99;
    private String accountNumber;
    public Nagad(String name,String number,double amount,String pin){
        super(name, amount,pin);
        this.accountNumber=number;
    }
    public Nagad(String name,String number,double amount){
        super(name, amount);
        this.accountNumber=number;
    }
    public Nagad(){
        super();
    }

    @Override
    public void cashIn(double amount) {
        if(amount<=30000)
            super.cashIn(amount);
        else
            System.out.println("Sorry.Cash in limit exceeded :(");
    }

    @Override
    public void cashOut(double amount, String myPin) {
        if (amount <= 30000) {
            super.cashOut(amount, myPin);
            balance = balance - ((amount * cashOutCharge) / 1000);
        } else
            System.out.println("Sorry.Cash out limit exceeded :(");
    }
}
