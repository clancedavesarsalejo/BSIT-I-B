import java.util.Scanner ;
public class GENTERONE_ACTIVITY_VII {
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);

    System.out.println("Enter a non-negative integer: ");
    long number = sc.nextInt();
    
   long fact =1;
   for(long x=1; x<= number;x++){
    fact*=x;

    System.out.println(fact);
    sc.close();
   }
}

}