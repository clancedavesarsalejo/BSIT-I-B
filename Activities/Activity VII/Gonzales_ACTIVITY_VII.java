import java.util.Scanner;
public class Gonzales_ACTIVITY_VII {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);
        long fact = 10;
        System.out.print("Enter the factorial number:");
        long num = sc.nextInt();

        for(long x=1; x<= num; x++) {
            fact*=x;
            System.out.print(fact);
            sc.close();
        }
    }
}