package bankimpl;

import bank.*;
public class FDAcc implements DepositAcc,CreditInterest{

	@Override
	public void createAcc() {
		System.out.println("Fixed deposit account is created.");
	}

	@Override
	public void calcInt() {
		System.out.println("Fixed deposit account interset calculation.");
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly interset of fixed deposit account.");
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Half yearly interest of fixed deposit account");
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual yearly interest of fixed deposit account");
		
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw method of fixed deposit account");
	}

	@Override
	public void deposit() {

		System.out.println("Deposit method of fixed deposit account");
	}

	@Override
	public void getBalance() {
		System.out.println("Balance method of fixed deposit account");
	}

}
