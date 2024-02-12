import java.util.Scanner;
    public class BOYLES_ACTIVITY_V{
        public static void main(String []args){
            Scanner Age = new Scanner(System.in);
         
            System.out.print("Enter Age: "); 
            int age = Age.nextInt();

            if (age >= 0 && age <= 11){
                System.out.println("child");
            } else if (age >= 12 && age <= 17) 
            {
                System.out.println("Teen");
            } else if (age >= 18 && age >= 64) 
            {
                System.out.println("Adult");
            }
           
        }

    }