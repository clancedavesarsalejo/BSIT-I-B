import java.util.Scanner;
public class SUMONOD_ACTIVITY_III {
  public static void main (String []args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Water Sensor!!");
    System.out.println("Pls input a integer: ");
    int x = sc.nextInt();
    if(x >= 100) {
      System.out.println("Boiling");
    } else {
      System.out.println("Not boiling");
    }
  }
}
