import  java.util.Scanner;
public class PESCUELA_ACTIVITY_VI {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.print("Input : ");
	int num = sc.nextInt();
        System.out.println("Countdown: ");
	    while(num >= 0){
	    System.out.printl(num);
    	num--;
        }
    }
}