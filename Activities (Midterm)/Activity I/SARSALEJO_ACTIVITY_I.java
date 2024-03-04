import java.util.Scanner;

public class SARSALEJO_ACTIVITY_I {
public static void main(String []args){
    String [] menu = {"New Egss", "New Times", };
    Scanner sc = new Scanner(System.in);

    System.out.print("Whats Your Answer: ");

    int ans;

    if (sc.hasNextInt()) {
       ans=sc.nextInt();
       if(ans >=0 && ans <menu.length ){
        String selectname = menu[ans];
        System.out.print(selectname);
       } else {
        System.out.print("Invalid");
       }

     }

   }

}
