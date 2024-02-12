import java.util.Scanner;
    public class QUISIDO_ACTIVITY_V{
        public static void main(String []args){
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your age: ");
            int age = input.nextInt();
            
            if(age>=0 && age<=11){
                System.out.print("Child");
            
            }else if(age>=12 && age<=64){
                System.out.print("Teen");

            }else if(age>=18 && age<=64){
                System.out.print("Adult");
            
            }
            
        }
    
    }