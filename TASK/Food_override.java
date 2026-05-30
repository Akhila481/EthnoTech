abstract class FoodOrder {
    String customerName;
    String address;
    FoodOrder(String customerName, String address) {
        this.customerName = customerName;
        this.address = address;
    }
    abstract void placeOrder();
    void displayCustomer() {
        System.out.println("Customer Name : " + customerName);
        System.out.println("Address : " + address);
    }
    // Method Overloading
    void displayCustomer(String city) {
        System.out.println("City : " + city);
    }
}
class PizzaItem extends FoodOrder {

    PizzaItem(String customerName, String address) {
        super(customerName, address);
    }
    @Override
    void placeOrder() {
        displayCustomer();
        displayCustomer("Madanapalle");
        System.out.println("Food Item : Pizza");
        System.out.println("Price : 250");
        System.out.println("Order Confirmed");
    }
}
class Dosa extends FoodOrder {
    Dosa(String customerName, String address) {
        super(customerName, address);
    }
    @Override
    void placeOrder() {
        displayCustomer();
        displayCustomer("Madanapalle");

        System.out.println("Food Item : Dosa");
        System.out.println("Price : 80");
        System.out.println("Order Confirmed");
    }
}
class Burger extends FoodOrder {

    Burger(String customerName, String address) {
        super(customerName, address);
    }

    @Override
    void placeOrder() {
        displayCustomer();
        displayCustomer("Madanapalle");

        System.out.println("Food Item : Burger");
        System.out.println("Price : 120");
        System.out.println("Order Confirmed");
    }
}
public class Food_override {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Pizza");
        System.out.println("2. Dosa");
        System.out.println("3. Burger");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        if (choice == 1) {
            PizzaItem p = new PizzaItem("Akhila", "Madanapalle");
            p.placeOrder();
        } else if (choice == 2) {
            Dosa d = new Dosa("Akhila", "Madanapalle");
            d.placeOrder();
        } else if (choice == 3) {
            Burger b = new Burger("Akhila", "Madanapalle");
            b.placeOrder();
        } else {

            System.out.println("Invalid Choice");

        }
        sc.close();
    }
}