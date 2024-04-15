import java.util.Scanner;
public class VERA_ACTIVITY_II{
public static void main(String[] args) {
      
    int feet = getfeet();
    int inches = feet * 12;
    System.out.println("Inches:"+inches);
} 
    
    static int getfeet(){
        Scanner sc = new Scanner(System.in);
        System.out.println ("Enter Feet:");
        return sc.nextInt();
      }
    }
