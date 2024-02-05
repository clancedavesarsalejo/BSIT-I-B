import java.util.Scanner;
public class CAMPO_ACTIVITY_III { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter temperature in Celsius: ");
        int a = scanner.nextInt();
            
        if (a>=100){
        System.out.println("boiling");}
        
        else{
        System.out.println("not boiling");}

    }
}

