
class BankAccount implements BankActions {
	//Global Elements
	private String name;
	private double balance;
	private double tax;
	
	//overloaded constructor
	public BankAccount(String name, double balance) {
		this.name = name;
		this.balance = balance;
		this.tax = .13;
	}
	
	
	//getters or mutators
	public String toString () {
		return "Name: " + getName() + "| Balance: " + getBalance();
	}
	//setter or mutators
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public void deposit(double amount) {
		this.balance += amount;
		System.out.println("Your new balance is: " + getBalance());
	}
	
	public void withdrawal(double amount) {
		if(amount > balance) {
			System.out.println("Insufficient funds");
		} else {
			this.balance -= amount;
			System.out.println("Your new balance is: " + balance);
		}
		
	}
}

class CorporateBank extends BankAccount{
	private int taxID;
	public CorporateBank(String name, double balance, int taxID) {
		super(name, balance);
		this.taxID = taxID;
	}
	
	//overwriting
	public void deposit(double amount) {
		super.deposit(amount + 25);
		System.out.println("Corporate bonus added");
	}
}
