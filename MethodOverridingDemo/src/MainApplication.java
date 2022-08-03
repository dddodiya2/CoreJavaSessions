
public class MainApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount b = new BankAccount();
		
		b.accountNumber = 112233;
		b.nameOfAccHolder = "Suresh";
		
		b.depositMoney(100);
		
		System.out.println(b.accBalance);
		
		b.depositMoney(300);
		System.out.println(b.accBalance);
		
		System.out.println("Now for LA");
		
		LoanAccount l = new LoanAccount();
		l.accountNumber = 123456;
		l.nameOfAccHolder = "Rajesh";
		l.accBalance = 1000 ;
		
		l.depositMoney(100);
		System.out.println(l.accBalance);
		
		BankAccount lb = new LoanAccount();
		lb.accountNumber = 1234567;
		lb.nameOfAccHolder = "Rajeshssssssss";
		lb.accBalance = 5000 ;
		
		lb.depositMoney(500);
		System.out.println(lb.accBalance);
		
		}

}
