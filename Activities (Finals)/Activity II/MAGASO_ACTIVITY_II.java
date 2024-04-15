import java.util.Scanner;

public class MAGASO_ACTIVITY_II {
    static int convert(int feet){
        System.out.println("Inches :");
        int inches = feet * 12;
        System.out.println(inches);
        return inches;
    }

    public static void main(String[] args) {
		System.out.println("Convert Feet to Inches(Input any number) :");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

     convert(num);
    }
}