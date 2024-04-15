import java.util.Scanner;

public class ANTEMARO_ACTIVITY_I {

    static int length() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of the rectangle ");
        return sc.nextInt();
    }

    static int width() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Width of the rectangle ");
        return sc.nextInt();
    }

    public static void main(String[] args) {
        int result = width() * length();
        System.out.println("Area of the rectangle:" + result);
    }
}
