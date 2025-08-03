package task4;
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int num = sc.nextInt();
        int count = 0;

        int temp = Math.abs(num); // handle negative numbers
        if (temp == 0) count = 1;
        else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }

        System.out.println("Number of digits: " + count);
    }
}
