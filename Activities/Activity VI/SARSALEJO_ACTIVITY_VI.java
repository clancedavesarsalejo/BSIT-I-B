import java.util.Scanner;

public class SARSALEJO_ACTIVITY_VI {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of seconds:");
        int num = sc.nextInt();
        
        while(num>= 0){
            System.out.println(num);
            num--;
        }
    }
            
}
