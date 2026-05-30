public class Bank_Main_Inheritance {

    public static void main(String[] args) {

        Bank_Inheritance b = new Bank_Inheritance();

        b.deposit(10000);

        b.withdraw(3000);

        b.show_balance();

        System.out.println("Balance using getter: " + b.getBalance());
    }
}