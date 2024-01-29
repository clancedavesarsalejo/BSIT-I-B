import java.util.Scanner;

public class MALUSAY_ACTIVITY_II{

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print( "Enter Number: ");
        int firstNumber = scanner.nextInt();
        System.out.print( "Enter second Number: ");
        int secondNumber = scanner.nextInt();
        
        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("Sum = "+ sum);
        System.out.println("Difference = "+ difference);
        System.out.println("Product = "+ product);

    }

}
