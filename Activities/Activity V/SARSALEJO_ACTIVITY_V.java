import java.util.Scanner;

public class SARSALEJO_ACTIVITY_V {
    public static void main (String []args) {
        Scanner sc = new Scanner(System.in);

        System.out.print(s:"Enter your age: ");
        int age = sc.nextInt();

        if (age>=0 && age <=11){
            System.out.println(s:"Child");
        } else if (age<=12 && age <=17){
            System.out.println(x:"Teen");
        } else if (age<=18 && age <=64){
            System.out.println(x:"Adult"); 
        }
    }
}  

