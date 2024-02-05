import java.util.Scanner;
public class VERA_ACTIVITY_III{
    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        System.out.print("Please input the temperature in Celsuis: ");
        int temp =  sc.nextInt(); 

        if(temp >= 100){
            System.out.println("Boiling!");
        }else{
            System.out.print("Not boiling");
        }
    }
}
