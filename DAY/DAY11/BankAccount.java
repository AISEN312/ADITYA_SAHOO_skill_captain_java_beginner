// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class BankAccount{
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;

    public BankAccount(int accountNumber,String accountHolderName,double accountBalance){
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.accountBalance = accountBalance;
    }
    public void deposit(double amount){
        if(amount>0){
            this.accountBalance += amount;
            System.out.println("Deposited" + amount + "into the account");}else {
            System.out.println("Invalid deposit account");
        }
    }
    public void withdraw(double amount){
        if(amount>0 && amount<= this.accountBalance){
            this.accountBalance -= amount;
            System.out.println("Withdrew " + amount + "from the account");
        }else{ System.out.println("Invalid withdrawal amount");
    }}
      public void display(){
            System.out.println("Account Number " + this.accountNumber);
            System.out.println("Account Holder Name" + this.accountHolderName);
            System.out.println("Account Balance" + this.accountBalance);
        }
        public static void main(String[] args){
            BankAccount account = new  BankAccount( 2201,"Adi Joshi", 500.0);
            account.deposit(300.0);
                    account.withdraw(100.0);
                    account.display();
        }
}