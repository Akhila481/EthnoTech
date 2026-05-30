import java.util.Scanner;
class Vehicle {
    void fare() {
        System.out.println("Fare Details");
    }
}
class Auto extends Vehicle {
    @Override
    void fare() {
        System.out.println("Distance : 2 KM");
        System.out.println("Auto Fare : 180");
    }
}
class Cab extends Vehicle {
    @Override
    void fare() {
        System.out.println("Distance : 2 KM");
        System.out.println("Cab Fare : 250");
    }
}
class Bike extends Vehicle {
    @Override
    void fare() {
        System.out.println("Distance : 2 KM");
        System.out.println("Bike Fare : 80");
    }
}
public class Booking_vehicle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Choose Vehicle");
        System.out.println("1. Auto");
        System.out.println("2. Cab");
        System.out.println("3. Bike");
        System.out.print("Enter Choice : ");
        int choice = sc.nextInt();
        Vehicle v;
        if(choice == 1) {
            v = new Auto();
        }
        else if(choice == 2) {
            v = new Cab();
        }
        else if(choice == 3) {
            v = new Bike();
        }
        else {
            System.out.println("Invalid Choice");
            return;
        }
        v.fare();
        sc.close();
    }
}