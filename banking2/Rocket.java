package banking2;

public class Rocket extends Account{
    final private double cashOutCharge=17.5;
    private String accountNumber;
    public Rocket(String name,String number,double amount,String pin){
        super(name, amount,pin);
        this.accountNumber=number;
    }
    public Rocket(String name,String number,double amount){
        super(name, amount);
        this.accountNumber=number;
    }
    public Rocket(){
        super();
    }

    @Override
    public void cashIn(double amount) {
        if(amount<=50000)
            super.cashIn(amount);
        else
            System.out.println("Sorry.Cash in limit exceeded :(");
    }

    @Override
    public void cashOut(double amount, String myPin) {
        if(amount<=50000){
            super.cashOut(amount, myPin);
            balance=balance-((amount*cashOutCharge)/1000);
        }
        else
            System.out.println("Sorry.Cash out limit exceeded :(");

    }
}
