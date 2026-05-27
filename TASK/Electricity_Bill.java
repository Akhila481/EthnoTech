import java.util.*;

public class Electricity_Bill {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int units, bill;

        System.out.println("Enter units :");
        units = sc.nextInt();

        if(units <= 250) {
            bill = 0;
        }
        else {
            bill = ((units - 250) / 50) * 50;
        }

        System.out.println("Electricity bill have to pay = Rs." + bill);
    }
}