import java.util.Scanner;

public class AMPO_ACTIVITY_1 {
    public static void main(String[] args) {
        String[] names = new String[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter the name " + (i + 1) + ": ");
            names[i] = sc.nextLine();
        }

        System.out.print("Enter the number of the name you would like to select (1-5): ");
        int selection = sc.nextInt();

        if (selection >= 1 && selection <= 5) {

            String selectedName = names[selection - 1];
            System.out.println("You have selected: " + selection + " is: " + selectedName);
        } else {
            System.out.println("Invalid selection.");
        }

        sc.close();
    }
}