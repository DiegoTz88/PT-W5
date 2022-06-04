
import java.util.*;
public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner kb = new Scanner(System.in);
		System.out.println("What is your name?");
		String name = kb.nextLine();
		
		System.out.println("How much money would you deposit?");
		
		double balance = Double.parseDouble(kb.nextLine());
		
		
		
		BankAccount acct1 = new BankAccount(name, balance);
		CorporateBank acct2 = new CorporateBank(name, balance, 6754);
		BankActions x = new BankAccount("Marty", 500);
		
		System.out.println("How much would you like to deposit?");
		balance = balance = Double.parseDouble(kb.nextLine());
		acct2.deposit(balance);
		
		System.out.println("How much would you like to withdrawal?");
		balance = balance = Double.parseDouble(kb.nextLine());
		acct2.withdrawal(balance);
	}

}
