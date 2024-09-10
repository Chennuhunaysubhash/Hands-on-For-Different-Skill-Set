package bankimpl;
import bank.*;
public class PersonalLoanAcc implements LoanAcc ,DebitInterest{

	@Override
	public void createAcc() {
		System.out.println("Personal loan account is created method.");
	}

	@Override
	public void calcInt() {
		System.out.println("Personal loan account interest calculation");
	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Deduct monthly interest of personal loan account");
	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Deduct half yearly interset of personal loan account");
	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Deduct yearly interest of personal loan account");
	}

	@Override
	public void repayPrincipal() {
		System.out.println("Repay principal of personal loan account");
	}

	@Override
	public void payInterest() {
		System.out.println("Pay interest of personal loan account");
	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Pay partial principal of personal loan account");
	}

}
