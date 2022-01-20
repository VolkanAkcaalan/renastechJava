package Kadir;

public class BankAccount {

    /*
        Create a class called BankAccount below that keeps track of the account holder’s name, the account number, and the balance in the account.
        Make sure you use the appropriate data types for these.
        Write 2 constructors for the class that initialize the instance variables to default values and to given parameters.
        For the parameters, use the same variable names as your instance variables. Use the this keyword to distinguish between the instance variables and the parameter variables.
        Write a toString() method for the class. Use the this keyword to return the instance variables.
        Write a withdraw(amount) and deposit(amount) for the class.
        Withdraw should subtract the amount from the balance as long as there is enough money in the account (the balance is larger than the amount).
        Deposit should add the amount to the balance. Use the this keyword to refer to the balance.
        Test your class below with a main method that creates a Bank Account object and calls its deposit and withdraw methods and prints out the object to test its toString() method.
     */


   private String holdersName;
   private long accountNumber;
   private double accountBalance;
   private static final String bankName= "TD";
   BankAccount(){}
   public BankAccount(String holdersName, long accountNumber, double accountBalance) {
      this.holdersName = holdersName;
      this.accountNumber = accountNumber;
      this.accountBalance = accountBalance;


   }



   public String getHoldersName() {
      return holdersName;
   }

   public void setHoldersName(String holdersName) {
      this.holdersName = holdersName;
   }

   public long getAccountNumber() {
      return accountNumber;
   }

   public void setAccountNumber(long accountNumber) {
      this.accountNumber = accountNumber;
   }

   public double getAccountBalance() {
      return accountBalance;
   }

   public void setAccountBalance(double accountBalance) {
      this.accountBalance = accountBalance;
   }

   @Override
   public String toString() {
      return (
              "\nholdersName='" + holdersName +
              "\naccountNumber=" + accountNumber +
              "\naccountBalance=" + accountBalance
              );
   }

   public void withdraw(double withdraw ) {
      if(accountBalance>withdraw) {
         System.out.println("eligible for withdraw");
         this.accountBalance = accountBalance - withdraw;
         System.out.println("Holder withdraw : " + withdraw);
      }
   }
   public void deposit(double deposit) {
      this.accountBalance=accountBalance+deposit;
      System.out.println("Holder deposit : " +deposit);

   }

   public static void main(String[] args) {
      System.out.println(bankName);
      BankAccount b2= new BankAccount();

      System.out.println(b2.toString());


      BankAccount b1=new BankAccount("Kefo",13578923,150250);

      System.out.println(b1.toString());
      System.out.println();
      b1.withdraw(50000);
      System.out.println("Holder account balance: "+b1.getAccountBalance());
      System.out.println();
      b1.deposit(10000);
      System.out.println("Holder account balance: "+b1.getAccountBalance());


   }

}
