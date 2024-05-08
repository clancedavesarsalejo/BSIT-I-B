import java.util.Scanner;
public class SUMONOD_ACTIVITY_I {
  static int width(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input value for width: ");
    int width = sc.nextInt();
    return width;
  }
  static int length(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input value for length: ");
    int length = sc.nextInt();
    return length;
  }
  public static void main(String []args){
    int getWidth = width();
    int getLegnth = length();
    int area = getWidth * getLegnth;
    System.out.println("Area: " + area);
      
      }
}
