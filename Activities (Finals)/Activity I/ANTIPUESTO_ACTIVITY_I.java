import java.util.Scanner;
public class ANTIPUESTO_ACTIVITY_I{
public static void main(String[] args) {
    int length = getLength();
    int width = getWidth();
    int area = length * width;
    System.out.println("Area =" +area);
}
public static int getLength(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Length Of The Rectangle: ");
    return sc.nextInt();
}
public static int getWidth(){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter The Width Of The Rectangle: ");
    return sc.nextInt();
}
}