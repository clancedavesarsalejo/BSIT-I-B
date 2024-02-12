import java.util.Scanner;
public class ENCABO_ACTIVITY_V {
    public static void main (String []args){
                                                                
        Scanner sc = new Scanner(System.in);
        System.out.print( "ENTER AGE");
        int age = sc.nextInt();

        if (age<=19 && age >=15){
            System.out.println("ADULT");
        }else if (age<=15  && age >=12){
            System.out.println("TEEN");
        }else{
            System.out.println("CHILD");
        }
    }
}