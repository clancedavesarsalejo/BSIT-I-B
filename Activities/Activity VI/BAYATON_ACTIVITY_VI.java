import java.util.Scanner;
public class BAYATON_ACTIVITY_VI {
    public static void main(String []args){
        Scanner sc =  new Scanner(System.in);

        System.out.println("Enter your number of seconds: ");
        int num = sc.nextInt ();

        while (num>=1){
            System.out.println(num);
            num--;
        }
        System.out.println("Coutdown Finished, You're ready to go.");
        sc.close();
    }
}
        
        




