import java.util.Scanner;
    public class QUISIDO_ACTIVITY_VII {
    
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.println("Enter your number:");
            long num = input.nextInt();

            long fact = 1;
            for(long x=1; x<=num; x++){
                fact*=x;
            }
            System.out.println("The factorial of" + " "+ num + " is " + fact);
        }
    }