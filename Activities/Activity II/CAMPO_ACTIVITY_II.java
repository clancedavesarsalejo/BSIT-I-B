import java.util.Scanner;
public class CAMPO_ACTIVITY_II { 
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
       
        System.out.println("Enter 1st number: ");
	int frstnum = scanner.nextInt();
        System.out.println("Enter 2nd number: ");
	int scndnum = scanner.nextInt();
	
        int sum = frstnum + scndnum;
        int dif = frstnum - scndnum;
        int prod = frstnum * scndnum;
    
        System.out.print("sum is = " + sum);
        System.out.print("difference is = " + dif);
        System.out.print("product is = " + prod);
    
        }
       }
       
