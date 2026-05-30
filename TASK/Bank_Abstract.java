class Bank_Abstract
{
	protected int balance;
	public bank(int balance)
	{
		this.balance=balance;
	}
	public void displayinfo()
	{
	    System.out.println("balance :"+balance);
	}
}
class Main extends Bank
{
    int ac_no;
    public Main(int ac_no, int balance)
    {
        this.ac_no = ac_no;
        super(balance);
    }
    @Override
    public void displayinfo()
    {
        super.displayinfo();
        System.out.println("account number:"+ac_no);
    }
     void deposit(int amount)
	{
	   balance+=amount;
	   System.out.println("after deposite balance is :"+balance);
	}
	void withdraw(int amount)
	{
	    balance-=amount;
	    System.out.println("after withdraw balance is"+balance);
	}
	public static void main(String[] args)
	{
	    Main b =new Main(1234,10000);
	    b.displayinfo();
	    b.deposit(10000);
	    b.withdraw(1000);
	}
}