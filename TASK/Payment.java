interface upi{
	void pay();
}
interface cash{
	void amount();
}
class Transaction implements upi,cash{
	public void pay() {
		System.out.println("Done the payment");
	}
	public void amount() {
		System.out.println("Amount paid successfully");
	}
}
public class Payment {
	public static void main(String[] args) {
		Transaction t=new Transaction();
		t.pay();
		t.amount();
	}

}