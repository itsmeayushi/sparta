package com.lti.hello;

public class Account {
	private int accountNo;
	private int accountBalance;
	private String accountPassword;

	private static String bankName = "ICICI";

	public Account(int accountNo, int accountBalance, String accountPassword) {
		this.accountNo = accountNo;
		this.accountBalance = accountBalance;
		this.accountPassword = accountPassword;
	}

	public int getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(int accountNo) {
		this.accountNo = accountNo;
	}

	public int getAccountBalance() {
		return accountBalance;
	}

	public void setAccountBalance(int accountBalance) {
		this.accountBalance = accountBalance;
	}

	public String getAccountPassword() {
		return accountPassword;
	}

	public void setAccountPassword(String accountPassword) {
		this.accountPassword = accountPassword;
	}



	public void displayAccount() {
		System.out.println("Your Account No. is: "+  getAccountNo() + "\nYour accountBalance is: "+
				getAccountBalance()+"\nYour accountPassword is: "+ getAccountPassword()+ "\nYour bankName is: " +Account.bankName);
	}

}
