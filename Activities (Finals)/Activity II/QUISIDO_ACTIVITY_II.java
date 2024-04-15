import java.util.Scanner;
public class QUISIDO_ACTIVITY_II {
    static void convert(int feet) {

        int res = feet*12;
        System.out.println("Inches: "+res);
      }
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter Feet Measurement: ");
        int feet = S.nextInt();
        convert(feet);
    }
}