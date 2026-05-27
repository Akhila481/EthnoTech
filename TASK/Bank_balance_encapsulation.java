class Bank_balance_encapsulation
{
    private int bal;
    public void setBalance(int bal) {
        this.bal = bal;
    }
    public int getBalance() {
        return bal;
    }
    public static void main(String[] args) {
        Bank_balance_encapsulation b = new Bank_balance_encapsulation();
        b.setBalance(5000);
        System.out.println("Bank Balance = " + b.getBalance());
    }
}