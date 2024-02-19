import java.util.Scanner;
public class PARIAN_ACTIVITY_VI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the number of seconds: ");
        int num = sc.nextInt();
        
        while(num>= 1){
            System.out.println(num); 
            num--; 
        }
        
        System.out.println("countdown fineshed");
        sc.close();

    } 
    
}
