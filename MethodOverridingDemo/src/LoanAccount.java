
public class LoanAccount extends BankAccount{

	public void depositMoney(double amount) {
		super.accBalance = super.accBalance - amount ;
	}
	
}
