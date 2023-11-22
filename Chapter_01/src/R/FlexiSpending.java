package R;

public class FlexiSpending {
	private double amount;
	private double mir;
	private double withdrawAmount;
	private int years;

	public FlexiSpending(double amount, double mir, double withdrawAmount) {
		this.amount = amount;
		this.mir = mir;
		this.withdrawAmount = withdrawAmount;
		this.years = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FlexiSpending s = new FlexiSpending(15000.0, 0.005, 2000.0);

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
