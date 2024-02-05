import java.util.Scanner;
    public class ENOJADA_ACTIVITY_III {
        public static void main (String[]args){
            Scanner sc = new Scanner (System.in);
            System.out.println("Enter your celsius:");
             int temp = sc.nextInt();
             
             if(temp>=100){
               System.out.println("Boiling");
             }
               else{

                System.out.println("Not Boiling");
               }
        }
    }