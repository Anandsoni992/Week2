import java.time.LocalDate; 
class BankAccount {
	int accountNumber ; 
	int balance ; 
	
	public BankAccount(int accountNumber, int balance){
	
		this.accountNumber = accountNumber; 
		this.balance = balance ; 
	}

	public void displayAccountType(){
		System.out.println("Account Number: " + accountNumber + "\nbalance: " + balance); 
	}
}
class SavingsAccount extends BankAccount {
	int interestRate; 
	public SavingsAccount (int accountNumber, int balance, int interestRate){
		super(accountNumber, balance); 
		this.interestRate = interestRate; 
	}
	public void displayAccountType(){
		System.out.println("Savings Account:"); 
		super.displayAccountType();
		System.out.println("Interest Rate: " + interestRate); 
	}
}
class CheckingAccount extends BankAccount {
	int withdrawallimit; 
	public CheckingAccount(int accountNumber, int balance, int withdrawallimit){

		super(accountNumber, balance) ;
		this.withdrawallimit = withdrawallimit; 
	}
	public void displayAccountType(){ 
		System.out.println("Checking Account:");
		super.displayAccountType(); 
		System.out.println("Withdrawal limit" + withdrawallimit); 
	}

}
class FixedDepositAccount extends BankAccount {
	LocalDate date; 
	public FixedDepositAccount(int accountNumber, int balance, LocalDate date){

		super(accountNumber, balance) ;
		this.date = date; 
	}
	public void displayAccountType(){ 
		System.out.println("Fixed Deposit Account:");
		super.displayAccountType(); 
		System.out.println("Date of initiation of fixed deposit" + date); 
	}

} 
public class BankAccountTypes{
	public static void main(String[] args){
		SavingsAccount savings = new SavingsAccount(34545,35000,5);
		savings.displayAccountType(); 
		CheckingAccount checking = new CheckingAccount(34545,35000,5000); 
		checking.displayAccountType(); 
		FixedDepositAccount fixed = new FixedDepositAccount(34545,35000,LocalDate.of(2025,1,24)); 
		fixed.displayAccountType(); 
	}
}
