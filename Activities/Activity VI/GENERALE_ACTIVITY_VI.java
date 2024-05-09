import java.util.Scanner;

public class GENERALE_ACTIVITY_VI {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter your number in seconds: ");
        int num = sc.nextInt();

        while(num>= 0){
        System.out.println(num);
        num--;
        }  
        System.out.println("Countdown Finished, You're ready to go.");
        sc.close();  
    }
    
}
