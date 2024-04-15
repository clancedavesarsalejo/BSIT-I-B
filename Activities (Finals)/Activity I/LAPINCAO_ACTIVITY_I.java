import java.util.Scanner;

public class LAPINCAO_ACTIVITY_I {
   public static void main(String []args){
    int length = Length();
    int width = Width();
    int area = length * width;
    System.out.println("Area = "+area);
   }

   public static int Length(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length of the rectangle: ");
    return sc.nextInt();
   }

   public static int Width(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the width of the rectangle: ");
    return sc.nextInt();
   }
    }