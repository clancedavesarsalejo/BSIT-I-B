import java.util.Scanner;
public class PARIAN_ACTIVITY_II {
    static void conversion(int feet, int inches){
        int convert = feet * inches;
        System.out.println("The conversion of feet to inches is: " + convert);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of feet: ");
        int feet = input.nextInt();
        conversion(feet,12);
        
    }
}
