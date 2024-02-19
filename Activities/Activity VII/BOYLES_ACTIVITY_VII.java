import java.util.Scanner;
public class BOYLES_ACTIVITY_VII{
    public static void main(String []args){
        Scanner S = new Scanner(System.in);

        long factorial = 1;
     
        System.out.print("Enter non-negative Interger number: ");
        int num = S.nextInt();

        
        for(int i=1; i<=num; i++){
            factorial *=i;
            System.out.println("Factorail of " + num + " is " + factorial);
        }
    }


}