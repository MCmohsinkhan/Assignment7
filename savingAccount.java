public class savingAccount extends BankAccount {

  public savingAccount(int accNumb) {
		super(accNumb);
	}

	double balance, penalty = 0;

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
	}

	public String toString() {
		return "accNumb " + accNumb + "\n" + "numWithdraws " + numWithdraws
				+ "\n" + "balance " + balance + "\n" + "status " + status;
	}
}
