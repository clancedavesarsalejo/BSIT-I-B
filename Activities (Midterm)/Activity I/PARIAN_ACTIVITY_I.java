import java.util.Scanner;

public class PARIAN_ACTIVITY_I{
    public static void main(String []args){
        String [] menu = {"Arnel","Arche", "Rogelio", "Joshua", "Roy"};
        Scanner sc = new Scanner(System.in);

        System.out.println("Choose You Name: ");
        System.out.println("0. Arnel");
        System.out.println("1. Arche");
        System.out.println("2. Rogelio");
        System.out.println("3. Joshua");
        System.out.println("4. Roy");
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
            System.out.println("**************************");
            System.out.println("       Name Choosed!      ");
            System.out.println("**************************");
            sc.close();
        }

    }
    
}
