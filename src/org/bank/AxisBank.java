package org.bank;

public class AxisBank extends BankInfo {
	
	public void deposit() {
		System.out.println("Deposit 15%");
	}
	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		a.savings();
		a.fixed();
		a.deposit();
	}

}
