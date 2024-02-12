import java.util.Scanner;
    public class RUBIN_ACTIVITY_V{
        public static void main(String[]args){
            Scanner Age = new Scanner(System.in);
            
        System.out.print("Enter your age");
            int age = Age.nextInt();  
            
            if(age>=0 && age<=11){
            System.out.println("child");
        }   else if(age >=12 && age<=17){
            System.out.println("teen");
        }   else if(age >=18 && age<=64){
            System.out.println("adult");
        } 


            
        }
    }