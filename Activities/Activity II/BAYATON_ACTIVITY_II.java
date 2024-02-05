import java.util.Scanner;
public class BAYATON_ACTIVITY_II{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.print ("Enter your first number");
        int firstNumber = sc.nextInt();
        System.out.print ("Enter your second number");
        int secondNumber = sc.nextInt();

        int sum = firstNumber + secondNumber;
        int difference = firstNumber - secondNumber;
        int product = firstNumber * secondNumber;

        System.out.println("sum = " + sum);
        System.out.println("difference = " + difference);
        System.out.println("product = "+ product);

    }
}


     
        
