import java.util.Scanner;
public class LUMANTAO_ACTIVITY_II {
   
    public static void main (String[]args) {
        Scanner scanner = new Scanner (System.in);
        
        System.out.println(Enter your first number: ");
        int first = scanner.nextInt();
        System.out.println(Enter your second number: "); 
        int second = scanner.nextInt();
        
        int sum = first + second;
        int difference = first - second;
        int product = first * second;

        System.out.println("Sum = " + sum);
        System.out.println(Difference = " + difference ); 
        System.out.println(Product = " + product);
   }


}