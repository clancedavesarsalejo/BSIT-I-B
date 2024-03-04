import java.util.Scanner;

public class MAG-ASO_ACTIVITY_I {
 

    public static void main(String []args){
        String [] menu = {"Keith","Andri", "Lordy", "Joshua", "Ashley"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose You Name: ");
        System.out.println("0. Keith");
        System.out.println("1. Andri");
        System.out.println("2. Lordy");
        System.out.println("3. Joshua");
        System.out.println("4. Ashley");
        System.out.print("Answer: ");


        int ans;

        if  (sc.hasNextInt()) {
            ans=sc.nextInt();
            if(ans >= 0 && ans <menu.length ){
                String selectname = menu[ans];
                System.out.println(selectname);
            } else {
                System.out.print ("Invalid");
            }
            System.out.println("************************");
            System.out.println("       Name Choosed!       ");
            System.out.println("************************");
            sc.close();
        }

    }
    
}


