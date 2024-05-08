import java.util.Scanner;
public class PESCUELA_ACTIVITY_I {
    static int length(int x) {
        return x;
    }
    static int width(int y) {
        return y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of your rectangle: ");
        int x = sc.nextInt();
        System.out.print("Enter the width of your rectangle: ");
        int y = sc.nextInt();
        int Area = length(x) * width(y);
        System.out.println("The area of your rectangle is: " + Area);
    }
}
