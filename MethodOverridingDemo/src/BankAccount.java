
public class BankAccount {
	
	int accountNumber;
	String nameOfAccHolder;
	double accBalance = 0;
	
	public void depositMoney(double amount) {
		accBalance = accBalance + amount ;
	}
	
}
