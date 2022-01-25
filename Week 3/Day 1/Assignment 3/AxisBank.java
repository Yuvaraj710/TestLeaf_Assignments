package week3.day1.assignment;

public class AxisBank extends BankInfo {
	
	public void deposit(int amount) {
		System.out.println("You Successfully deposited Rs."+amount + " in the bank.");
	}

	public static void main(String[] args) {
		
		BankInfo bank = new BankInfo();
		AxisBank axis = new AxisBank();
		
		bank.saving();
		bank.fixed();
		bank.deposit();
		
		axis.deposit(1000);

	}

}
