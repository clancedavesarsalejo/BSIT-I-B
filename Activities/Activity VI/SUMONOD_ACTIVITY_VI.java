import java.util.Scanner;
public class SUMONOD_ACTIVITY_VI {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    System.out.print("Input a value: ");
    int cD = sc.nextInt();
    while(cD >= 0){
      System.out.println(cD);
      cD--;
    }
    sc.close();
  }
}