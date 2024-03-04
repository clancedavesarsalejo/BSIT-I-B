import java.security.interfaces.RSAKey;
import java.util.Scanner;
public class LAPINCAO_ACTIVITY_1{

    public static void main(String[]args){
        Scanner sc = new Scanner (System.in);
        String [] names = new String[5];

        for(int i= 0; i<names.length; i++){
        System.out.println("Enter your Name:"+(i+1)+ ": ");
        names [i] = sc.nextLine();
        }
        
           System.out.println("Enter Index For Access");
           int v = sc.nextInt();
           
          
           if(v >= 1 && v <= names.length){
            System.out.println("You Have Selected:"+ names[ v-1]+" ");
           }else{
            System.out.println("Invalid");
           }
            
           
        
    }
}
