abstract class Foodorder
{
    String customerName;
    int quantity;
    double price;

    Foodorder()
    {
        System.out.println("Welcome to our food ordering system!");
    }

    Foodorder(String name, int quantity, double price)
    {
        this.customerName = name;
        this.quantity = quantity;
        this.price = price;
    }

    abstract void orderFood();

    void generateBill()
    {
        double total = quantity * price;

        System.out.println("Customer Name : " + customerName);
        System.out.println("Quantity      : " + quantity);
        System.out.println("Price per Item: " + price);
        System.out.println("Total Bill    : " + total);
    }
}

class Pizza extends Foodorder
{
    Pizza(String name, int quantity, double price)
    {
        super(name, quantity, price);
    }

    void orderFood()
    {
        System.out.println("Pizza order placed successfully!");
    }
}

public class Abstract_delivery
{
    public static void main(String[] args)
    {
        Pizza p = new Pizza("Akhila", 2, 250);

        p.orderFood();

        System.out.println();

        p.generateBill();
    }
}