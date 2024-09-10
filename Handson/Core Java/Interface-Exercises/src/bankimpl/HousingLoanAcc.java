package bankimpl;
import bank.*;
public class HousingLoanAcc implements  LoanAcc,DebitInterest{

	@Override
	public void createAcc() {
		System.out.println("Housing loan account is created");
	}

	@Override
	public void calcInt() {
		System.out.println("Housing loan accounts interest calculations");
	}

	@Override
	public void deductMonthlyInt() {
		System.out.println("Deduct monthly interest of housing loan account");
	}

	@Override
	public void deductHalfYrlyInt() {
		System.out.println("Deduct half yearly interest of housing loan account");
	}

	@Override
	public void deductAnnualInt() {
		System.out.println("Deduct yearly interest of housing loan account");
	}

	@Override
	public void repayPrincipal() {
		System.out.println("Repay principal of housing loan account");
	}

	@Override
	public void payInterest() {
		System.out.println("Pay interest of housing loan account");
	}

	@Override
	public void payPartialPrincipal() {
		System.out.println("Pay partial principal of housing loan account");

	}

}
