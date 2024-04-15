import java.util.Scanner;
public class GENTERONE_ACTIVITY_II {
 public static void main (String[] args) {

    int feet = getfeet ();
    int inches = feet * 12;
    System.out.println(inches);
 }

    static int getfeet() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter feet:");
        return sc.nextInt();
    }


    

    
    }

