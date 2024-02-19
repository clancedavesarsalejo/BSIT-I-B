import  java.util.Scanner;
public class CAMPO_ACTIVITY_VII {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	System.out.println("enter number: ");
	int num1 = sc.nextInt();
	long num2=1;

	for(int x=1; x<=num1; x++){
	num2*=x;}
	System.out.println("The factorial is: "+num2);
}}