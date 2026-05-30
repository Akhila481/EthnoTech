class Bank {
    private int balance;
    public void setBalance(int bal) {
        this.bal = bal;
    }
    public int getBalance() {
        return bal;
    }
    public static void main(String[] args) {
        Bank b = new Bank();
        b.setBalance(5000);
        System.out.println("Bank Balance = " + b.getBalance());
    }
}