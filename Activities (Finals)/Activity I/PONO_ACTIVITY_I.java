import java.util.Scanner;
   public class PONO_ACTIVITY_I{
    public static void main(string[]args){
        int length = getLength();
        int width = getWidth();
        int area = length * width;
        System.out.println("Area =" + area );
    }
    public static int getLength(){
     Scanner sc = new Scanner (System.in);
     System.out.prnt("Enter the Length of the rectangle:");
     return sc.nextInt();
    }
    public static int getWidth(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Width of the rectangle:");
        return sc.nextInt();
    }
   }