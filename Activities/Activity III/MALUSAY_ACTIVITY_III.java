import java.util.Scanner;

public class MALUSAY_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print( "Enter Celcius: ");
        int temp = scanner.nextInt();


        if (temp < 100) {
            System.out.println("Not Boiling");
         } else {
            System.out.println("Boiling");
         }
        }
    }