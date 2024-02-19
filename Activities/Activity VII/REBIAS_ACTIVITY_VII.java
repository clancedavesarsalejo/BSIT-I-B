import java.util.Scanner;
public class REBIAS_ACTIVITY_VII {
    public static void main(String[]args) {
        Scanner sc = new Scanner (System.in);

        System.out.print("Enter a Factorial number:");
        long number= sc.nextInt();
        long fact= 1;
        for(long x=1; x<= number;x++){
            fact*=x;
    }
            System.out.print(fact);
            sc.close();
        }


}
