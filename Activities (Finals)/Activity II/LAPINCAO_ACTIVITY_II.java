import java.util.Scanner;
public class LAPINCAO_ACTIVITY_II {

    static void convert(int feet, int inches){
   int convert = feet*inches;
    Scanner sc = new Scanner(System.in);
    System.out.println("Inches"+convert);
    }
    public static void main (String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Value");
       int feet = sc.nextInt();
       convert(feet,12);
    }
    
}
