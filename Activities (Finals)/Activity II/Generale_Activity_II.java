import java.util.Scanner;

public class Generale_Activity_II {
    
    static void convert(double feet) {
        double inches = feet * 12.0;
        System.out.println(inches);
        return inches;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
        System.out.print(Enter Your Number: );
        convert(num);
        
    }
}
