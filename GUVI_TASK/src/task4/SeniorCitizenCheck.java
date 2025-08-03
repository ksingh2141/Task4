package task4;
import java.util.Scanner;

public class SeniorCitizenCheck {
    public static void main(String[] args) {
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();

        if (age >= 60) {
            System.out.println("The person is a senior citizen.");
        } else {
            System.out.println("The person is not a senior citizen.");
        }
    }
}
