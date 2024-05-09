import java.util.Scanner;

public class ACAYLAR_ACTIVITy_VI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.print("Enter the Countdown: ");
            int time = sc.nextInt();

            int sec = time; 

            while (sec >= 0) {
                System.out.println(sec);
                sec--;
            }

            System.out.println("Countdown completed.");

            
            System.out.print("Do you want to start a new countdown? (yes/no): ");
            String answer = sc.next();

            if (!answer.equalsIgnoreCase("yes")) {
                System.out.println("Exiting the program.");
                break; 
            }
        }

        sc.close();
    }

}
