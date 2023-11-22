package R;

public class Spending {
	private double amount = 10000.0;
	private double mir = 0.005;
	final private double withdrawAmount = 500.0;
	private int years = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Spending s = new Spending();

		while (true) {
			if (s.amount < 0) {
				break;
			}
			s.monthEnd();
			s.monthlyWithdraw();
			s.years += 1;
		}
		System.out.println(String.format("%d years", s.years));
	}

	public void monthEnd() {
		this.amount = this.amount * (1 + this.mir);
	}

	public void monthlyWithdraw() {
		this.amount = this.amount - this.withdrawAmount;
	}
}
