import java.util.Scanner;
public class PESCUELA_ACTIVITY_II {
    static void conversion(int feet){
        int convert = feet * 12;
        System.out.println("Inches: " + convert);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of feet: ");
        int feet = sc.nextInt();
        conversion(feet);
    }
}
