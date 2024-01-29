import java.util.Scanner;
public class SUMONOD_ACTIVITY_II{
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("1st Input Value: ");
    int firstNumber = sc.nextInt();
    System.out.println("2nd Input Value: ");
    int secondNumber = sc.nextInt();

    int sum = firstNumber + secondNumber;
    int diff = firstNumber - secondNumber;
    int product = firstNumber * secondNumber;

    System.out.println("sum =" + sum);
    System.out.println("difference =" + diff);
    System.out.println("product =" + product);

    sc.close();

  }
}