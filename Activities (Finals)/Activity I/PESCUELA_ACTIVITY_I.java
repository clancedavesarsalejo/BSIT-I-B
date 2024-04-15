import java.util.Scanner;
public class PESCUELA_ACTIVITY_I {
    static int lenght(){
        System.out.println(lenght);
    }
    static int width(){
        System.out.println(width);
    }
    public static void main(String[] args) {
        int lenght;
        int width;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the lenght of your rectangle: ");
        return lenght = sc.nextInt();
        System.out.println("Enter the width of your rectangle: ");
        return width = sc.nextInt();

        int Area = lenght()* width();
        System.out.println("The area of your rectangle is: " + Area);

    }
}