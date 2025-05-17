/*Write a JAVA program which has Class called Account that creates account with Rs500
  minimum balance, a deposit() method to deposit amount, a withdraw() method to withdraw
  amount and also throws LessBalanceException if an account holder tries to withdraw
  money which makes the balance become less than Rs500.
i. A Class called LessBalanceException which returns the statement that says withdraw
   amount (Rs) is not valid.
ii. A Class which creates 2 accounts, both account deposit money and one account tries to
    withdraw more money which generates a LessBalanceException take appropriate action for
    the same.
*/
class LessBalanceException extends Exception{
    public LessBalanceException(double amount){
        super("Withdraw amount " +amount+ "Rs isn't possible");
    }
}
class  Acc{
    double balance;
    static final double min_bal = 500;
    public Acc(){
        balance = min_bal;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited "+amount+" Rs. New balance: "+balance+" Rs");
    }
    public void withdraw(double amount) throws LessBalanceException{
        if(balance-amount<min_bal){
            throw new LessBalanceException(amount);
        }
        balance-=amount;
        System.out.println("Withdrawn "+amount+" Rs. New balance: "+balance+" Rs");
    }
    public double getBalance(){
        return balance;
    }
}
public class Account {
    public static void main(String[] args) {
        Acc a1 = new Acc();
        Acc a2 = new Acc();
        a1.deposit(1000);
        a2.deposit(2000);
        try{
            a1.withdraw(1600);
        } catch(LessBalanceException e){
            System.out.println("LessBalanceException: " +e.getMessage());
        }
        try{
            a2.withdraw(100);
        } catch(LessBalanceException e){
            System.out.println("LessBalanceException: " +e.getMessage());
        }
    }
}
