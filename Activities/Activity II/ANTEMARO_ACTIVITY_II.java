import java.util.Scanner;

public class ANTEMARO_ACTIVITY_II{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first number: ");
        int firstnumber = sc.nextInt();
        System.out.print("Enter your second number: ");
        int secondnumber = sc.nextInt();

        int sum = firstnumber + secondnumber;
        int difference = firstnumber - secondnumber;
        int product = firstnumber * secondnumber;
        
        System.out.println("Sum = " + sum);
        System.out.println("Difference = " + difference);
        System.out.println("Product = " + product);
        

    }
    
}