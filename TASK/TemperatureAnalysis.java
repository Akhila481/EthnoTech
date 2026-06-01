import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[30];

        int highest, lowest, hotdays = 0, sum = 0;

        System.out.println("Enter 30 days temperatures:");

        for(int i = 0; i < 30; i++) {
            arr[i] = sc.nextInt();
        }

        highest = Integer.MIN_VALUE;
        lowest = Integer.MAX_VALUE;

        for(int i = 0; i < 30; i++) {

            if(arr[i] > highest) {
                highest = arr[i];
            }

            if(arr[i] < lowest) {
                lowest = arr[i];
            }

            if(arr[i] > 35) {
                hotdays++;
            }

            sum += arr[i];
        }

        double average = (double) sum / 30;

        System.out.println("Highest Temperature = " + highest);
        System.out.println("Lowest Temperature = " + lowest);
        System.out.println("Average Temperature = " + average);
        System.out.println("Number of Hot Days = " + hotdays);
    }
}