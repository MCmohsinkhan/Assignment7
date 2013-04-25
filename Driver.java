public class Driver {

	public static void main(String[] args) {

		savingAccount a1 = new savingAccount(1001);

		System.out.println(a1.toString());

		a1.setBalance(101.0);
		System.out.println("\nafter setBalance method");
		System.out.println(a1.toString());

		a1.monthlyProcess();
		System.out.println("\nafter monthlyProcess");
		System.out.println(a1.toString());
	}
}
