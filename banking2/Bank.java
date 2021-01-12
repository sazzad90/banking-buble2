package banking2;

public class Bank {
    public Bank(){

    }
    public void startBanking() {
        Bkash arifAccount = new Bkash("Arif", "01727873747", 50000, "1234");
        Rocket zamanAccount = new Rocket("Zaman", "018374783887", 80000, "7788");
        Nagad ramimAccount = new Nagad("Ramim", "0198273389", 45000, "8998");

        System.out.println(arifAccount);
        arifAccount.cashIn(4000);
        arifAccount.cashOut(18000,"1234");
        System.out.println("Account name:: "+arifAccount.getHolderName()+"\nRemaining balance:: "+arifAccount.getBalance());

        System.out.println(zamanAccount);
        arifAccount.cashIn(40000);
        arifAccount.cashOut(180000,"1234");
        System.out.println("Account name:: "+zamanAccount.getHolderName()+"\nRemaining balance:: "+zamanAccount.getBalance());

        System.out.println(ramimAccount);
        arifAccount.cashIn(64000);
        arifAccount.cashOut(18000,"1234");
        System.out.println("Account name:: "+ramimAccount.getHolderName()+"\nRemaining balance:: "+ramimAccount.getBalance());
    }
}
