import java.util.Scanner;

public class ACAYLAR_ACTIVITy_VII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Factorial Number: ");
        long number = sc.nextInt();
        long fact = 1;
        for (i = 1; i <= number; i++) {
            fact *= i;
        }
        System.out.print(fact);

    }
}