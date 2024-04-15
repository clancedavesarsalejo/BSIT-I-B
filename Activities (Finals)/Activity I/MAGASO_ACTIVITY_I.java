    import java.util.Scanner;
    public class MAGASO_ACTIVITY_I{
        static int length(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the length : ");
            return sc.nextInt();
        }   
        static int width(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the width : ");
            return sc.nextInt();
        }
        public static void main(String [] args){
            long area= (long)length() * (long)width();
    
            System.out.println("The area of the rectangle is : " + area);
        }
    }