
public class SalaryEmployee extends Employee{

	public SalaryEmployee(String firstName, String lastName, double pay) {
		super(firstName, lastName, pay);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculatePay() {
		return getPay() * 80;
	}

	
}
