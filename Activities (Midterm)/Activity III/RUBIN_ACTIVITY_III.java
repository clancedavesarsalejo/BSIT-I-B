1
import java.util.Scanner;

public class RUBIN_ACTIVITY_III {
    public static void main (String []args){
        
        Scanner sc = new Scanner(System.in);
        int [][] score = new int [5] [5];
        for (int x=0; x<score.length; x++){
            for(int y=0; y<score.length; y++){
            System.out.print("Enter your score" + " of row #" + (y+1)+ ": ");
            score [x] [y] = sc.nextInt();
            }
            int sum=0;
            System.out.println(sum % score.length);
        }
        
        sc.close();
    }
}