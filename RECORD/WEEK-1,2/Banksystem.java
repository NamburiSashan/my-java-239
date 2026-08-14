package record;
import java.util.Scanner;
class Account{
	int accNo;
	double balance;
	String type;
	Account(int no,double bal,String t){
		accNo = no;
		balance = bal;
		type = t;
	}
	void deposit(double amt) {
		balance  += amt;
		System.out.println("DEPOSITED:" + amt);
		System.out.println("BALANCE:" + balance);
	}
	void withdraw(double amt) {
		if(amt <= balance) {
			balance -= amt;
			System.out.println("WITHDRAW:" + amt);
			System.out.println("BALANCE:" + balance);
		}
		else {
			System.out.println("NOT ENOUGH BALANCE!");
		}
	}
	void transfer(Account other,double amt) {
		if(amt <= balance) {
			balance -= amt;
			other.balance += amt;
			System.out.println("TRANSFER DONE!");
		}
		else {
			System.out.println("TRANSFER FAILED!");
		}
	}
	void show() {
		System.out.println("Acc NO:" + accNo);
		System.out.println("TYPE:" + type);
		System.out.println("BALANCE:" + balance);
	}
}
class SavingsAccount extends Account{
	double rate;
	SavingsAccount(int no,double bal,double r){
		super(no,bal,"Savings");
		rate = r;
	}
	void CalcIntrest() {
		double intrest = balance*rate/100;
		System.out.println("INTREST:" + intrest);
	}
}
class CurrentAccount extends Account{
	double limit;
	CurrentAccount(int no,double bal,double l){
		super(no,bal,"CURRENT");
		limit = l;
	}
	//override
	void withdraw(double amt) {
		if(amt <= balance+limit) {
			balance -= amt;
			System.out.println("WITHDRAW OK BALANCE IS:" + balance);
		}
		else {
			System.out.println("OVERDRAFT LIMIT CROSSED!");
		}
	}
}
public class Banksystem {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		SavingsAccount sAcc = new SavingsAccount(101,5000,5);
		CurrentAccount cAcc = new CurrentAccount(201,3000,2000);
		int ch;
		do {
			System.out.println("\n---BANK MENU---");
			System.out.println("1.DEPOSIT(SAVINGS)");
			System.out.println("2.WITHDRAW(SAVINGS)");
			System.out.println("3.INTREST(SAVINGS)");
			System.out.println("4.WITHDRAW(CURRENT)");
			System.out.println("5.TRANSFER SAVINGS->CURRENT");
			System.out.println("6.SHOW ACCOUNTS");
			System.out.println("7.EXIT");
			System.out.println("CHOICE");
			ch = s.nextInt();
			switch(ch) {
			case 1:
				System.out.println("AMOUNT:");
				sAcc.deposit(s.nextDouble());
				break;
			case 2:
				System.out.println("AMOUNT:");
				sAcc.withdraw(s.nextDouble());
				break;
			case 3:
				sAcc.CalcIntrest();
				break;
			case 4:
				System.out.println("AMOUNT:");
				cAcc.withdraw(s.nextDouble());
				break;
			case 5:
				System.out.println("AMOUNT");
				sAcc.transfer(cAcc,s.nextDouble());
				break;
			case 6:
				System.out.println("SAVINGS:");
				sAcc.show();
				System.out.println("CURRENT:");
				cAcc.show();
				break;
			case 7:
				System.out.println("BYE!");
				break;
				default:
					System.out.println("WRONG CHOICE!");
			}
		}
		while(ch != 7);
		s.close();
	}
}
