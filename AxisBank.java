package org.Bank;

public class AxisBank extends BankInfo {
	
	//this is method overriding
	
	public void deposit()
	{
		System.out.println("This is deposit acc in Axis Bank");
		
	}

	public static void main(String[] args) {
		
		AxisBank axb = new AxisBank();
		
		axb.saving();
		axb.fixed();
		axb.deposit();
	
		

	}

}
