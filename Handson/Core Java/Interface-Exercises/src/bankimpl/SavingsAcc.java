package bankimpl;
import bank.*;
public class SavingsAcc implements DepositAcc,CreditInterest{
	
	@Override
	public void createAcc() {
		System.out.println("Saving account is created.");
	}

	@Override
	public void calcInt() {
		System.out.println("Saving account interest calcultion method.");
	}

	@Override
	public void addMonthlyInt() {
		System.out.println("Monthly interest of saving account");
	}

	@Override
	public void addHalfYrlyInt() {
		System.out.println("Half yearly interest of saving account");
	}

	@Override
	public void addAnnualInt() {
		System.out.println("Annual interest of saving account");
	}

	@Override
	public void withdraw() {
		System.out.println("Withdraw method of saving account");
	}

	@Override
	public void deposit() {
		System.out.println("Deposit method of saving account");
	}

	@Override
	public void getBalance() {
		System.out.println("Balance method of saving account");
	}

}
