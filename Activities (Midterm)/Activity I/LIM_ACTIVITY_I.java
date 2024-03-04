import java.util.Scanner;

public class LIM_ACTIVITY_I {
    public static void main(String []args){
        String [] menu = {"Lumantao","Clance", "Rogelio", "Trucio", "Paran"};
        Scanner sc = new Scanner(System.in);

        System.out.print("What's Your Answer: ");

        int ans;

        if  (sc.hasNextInt()) {
            ans=sc.nextInt();
            if(ans >= 0 && ans <menu.length ){
                String selectname = menu[ans];
                System.out.println(selectname);
            } else {
                System.out.print ("Invalid");
            }
            sc.close();
        }

    }
    
}
