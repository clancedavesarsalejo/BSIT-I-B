import java.util.Scanner;

public class ACAYLAR_ACTIVITY_III {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter temperature in Celsius:");

        int celsius = scanner.nextInt();

        if (celsius >= 100) {
            System.out.println("Boiling");
        } else if (celsius <= 70) {
            System.out.println("Not Boiling");
        } else {
            System.out.println("Not Boiling");
        }
    }

}