import java.util.Scanner;
public class SUMONOD_ACTIVITY_VII {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Input an integer: ");
    long num = sc.nextInt();

    long fact = 1;
    for(long x = 1; x <= num; x++){
      fact*=x;
    }
    System.out.println("Factorial of " + num + " is " + fact);
    sc.close();
  }
}
