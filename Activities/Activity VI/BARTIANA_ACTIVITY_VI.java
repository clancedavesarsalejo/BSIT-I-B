import java.util.Scanner;
public class BARTIANA_ACTIVITY_VI {

  public static void main(String[]args){
        
    Scanner sc = new Scanner(System.in);
    int sec = 5;
    System.out.print("Enter the countdown:");
    int time = sc.nextInt();


    while(sec>=0){
        System.out.println(sec);
        sec--;
    }
    
     
    }
}
