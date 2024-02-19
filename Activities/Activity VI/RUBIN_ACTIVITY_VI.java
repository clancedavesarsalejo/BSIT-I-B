import java.util.Scanner;
public class RUBIN_ACTIVITY_VII {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        long number = sc.nextInt();
        long fact = 1;
        for(long x=1; x<= number;x++){
            fact*=x;
        }
        System.out.print("The Answer is: " + fact);
        sc.close();
    }
}