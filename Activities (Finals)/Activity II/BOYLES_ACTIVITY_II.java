import java.util.Scanner;
public class BOYLES_ACTIVITY_II {
    static void con (int feet) {

        int res = feet*12;
        System.out.println(res);
      }
    public static void main(String[] args) {
        Scanner S = new Scanner (System.in);
        System.out.println("Enter Feet Measurement: ");
        int feet = S.nextInt();
        con(feet);
    }
}