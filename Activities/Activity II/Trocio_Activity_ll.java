import java.util.Scanner;
    
    public class Trocio_Activity_ll{
     public static void main (String []args) {
     Scanner scanner = new Scanner (System.in);
    
     System.out.print("Enter your first number:");
     int firstNumber = scanner.nextInt();
     System.out.print("Enter your second number:");
     int secondNumber = scanner.nextInt();

     int sum = firstNumber + secondNumber;
     int diff = firstNumber - secondNumber;
     int prod = firstNumber * secondNumber;

     System.out.println("Sum = + sum");
     System.out.println("Difference = - difference");
     System.out.println("Product = * product");

     }

    
    
     


    
}
