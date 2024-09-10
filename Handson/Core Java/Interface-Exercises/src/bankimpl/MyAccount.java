package bankimpl;

public class MyAccount {
	public static void main(String[] args) {
		SavingsAcc sa = new SavingsAcc();
		FDAcc fda = new FDAcc();
		PersonalLoanAcc pla = new PersonalLoanAcc();
		HousingLoanAcc hla = new HousingLoanAcc();
		sa.createAcc();
		sa.calcInt();
		sa.addMonthlyInt();
		sa.addHalfYrlyInt();
		sa.addAnnualInt();
		System.out.println();
		fda.createAcc();
		fda.calcInt();
		fda.addMonthlyInt();
		fda.addHalfYrlyInt();
		fda.addAnnualInt();
		System.out.println();
		pla.createAcc();
		pla.calcInt();
		pla.deductMonthlyInt();
		pla.deductHalfYrlyInt();
		pla.deductAnnualInt();
		pla.payInterest();
		pla.repayPrincipal();
		pla.payPartialPrincipal();
		System.out.println();
		hla.createAcc();
		hla.calcInt();
		hla.deductMonthlyInt();
		hla.deductHalfYrlyInt();
		hla.deductAnnualInt();
		hla.payInterest();
		hla.repayPrincipal();
		hla.payPartialPrincipal();
	}

}
