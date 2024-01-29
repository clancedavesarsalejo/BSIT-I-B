import java.util.Scanner;

public class ENOJADA_ACTIVITY_II {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter your fist number: ");
        int firstNumber = in.nextInt();
        System.out.print("Enter your second number: ");
        int secondNumber = in.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("Sum = " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);

    }
}
