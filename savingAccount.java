public class savingAccount extends BankAccount {

	public savingAccount(int accNumb) {
		super(accNumb);
	}

	double balance, penalty = 0, MI, MIR, AIR;

	@Override
	public void monthlyProcess() {

		balance = getBalance();

		if (balance < 100) {
			setStatus(false);
			if (balance == 0)
				penalty += 1;
		}
		if (numWithdraws > 4)
			penalty += (numWithdraws - 4);

		balance -= penalty;

		MIR = (AIR / (12 * 100));
		MI = balance * MIR;
		balance = balance + MI;

	}

	public double getAnnualInterestRate(double percent) {
		return percent;
	}

	public void setAnnualInterestRate(double AIR) {
		this.AIR = AIR;
	}

	public String toString() {
		return "accNumb " + accNumb + "\n" + "numWithdraws " + numWithdraws
				+ "\n" + "balance " + balance + "\n" + "status " + status;
	}
}
