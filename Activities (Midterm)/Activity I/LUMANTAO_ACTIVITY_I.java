import java.util.Scanner;

public class LUMANTAO_ACTIVITY_I {
    public static void main(String []args){
        String [] menu = {"Joseph","Clance", "Russel", "Joshua", "Jemar"};
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

        }

    }
    
}

