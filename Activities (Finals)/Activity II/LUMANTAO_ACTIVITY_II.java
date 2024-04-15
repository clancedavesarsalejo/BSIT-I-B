import java.util.Scanner;

public class LUMANTAO_ACTIVITY_II {
    public static void main(String[] args) {
        System.out.print("Enter the number of feet to convert to inches: ");
        Scanner scanner = new Scanner(System.in);
        double feet = scanner.nextDouble();
        double inches = convertFeetToInches(feet);
        System.out.printf("%.2f feet is equal to %.2f inches.%n", feet, inches);
    }

    public static double convertFeetToInches(double feet) {
        return feet * 12;
    }
}