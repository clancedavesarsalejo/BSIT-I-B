import java.util.Scanner;

public class ACAYLAR_ACTIVITy_VII {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sec = 5;
        System.out.print("Enter the Countdown: ");
        int time = sc.nextInt();

        while (sec >= 0) {
            System.out.println(sec);
            sec--;
        }
    }

}