import java.util.Scanner;
public class SUMONOD_ACTIVITY_II {
  static void convert(int feet, int inch){
    int convert = feet * inch;
    System.out.println("Inches: " + convert);
  }
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Input value for feet: ");
    int feet = sc.nextInt();
    convert(feet, 12);
    sc.close();
  }
}
