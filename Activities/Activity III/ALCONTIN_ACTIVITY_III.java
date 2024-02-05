import java.util.Scanner;
    public class ALCONTIN_ACTIVITY_III {
        public static void main (String [] args){
            Scanner sc = new Scanner (System.in);
            int temp;
            do{
            System.out.print("Enter Temperature (Celsius)");
            temp = sc.nextInt();
            if(temp>=100){
                System.out.println("Boiling");
             } 
             else if(temp <= 100){
                System.out.println("Not Boiling");
             }
            }while (temp !=0);



            


        }
    }