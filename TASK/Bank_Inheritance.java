class Bank_Inheritance{
	protected double balance;
	void deposit(double amount) {
		balance=balance+amount;
		System.out.println("Deposited amount : "+balance);
	}
	void withdraw(double amount) {
		if(amount<=balance) {
			balance=balance-amount;
			System.out.println("Withdrawn amount : "+balance);
		}
		else {
			System.out.println("Insufficient amount");
		}
	}
	public double getBalance() {
		return balance;
	}
	public void show_balance() {
		System.out.println("Current balance : "+balance);
	}
}