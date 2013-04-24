public abstract class BankAccount {

  int accNumb, numWithdraws;
	double balance;
	boolean status;

	public BankAccount(int accNumb) {
		this.accNumb = accNumb;
		numWithdraws = 0;
		balance = 0;
		status = true;

	}

	public int getAccNumb() {
		return accNumb;
	}

	public double getBalance() {
		return balance;

	}

	public boolean getStatus() {
		return status;
	}

	public int getnumWithdraws() {
		return numWithdraws;
	}

	public void setAccNumb(int accNumb) {
		this.accNumb = accNumb;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public void setnumWithdraws(int numWithdraws) {
		this.numWithdraws = numWithdraws;
	}

	public abstract void monthlyProcess();

	public void deposit(double amount) {
		balance += amount;
	}

	public void withDraw(double amount) {
		numWithdraws++;
		balance -= amount;
	}

	public String toString() {
		return null;
	}

}
