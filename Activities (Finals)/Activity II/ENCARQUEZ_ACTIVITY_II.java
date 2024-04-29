import java.util.Scanner;
class ENCARQUEZ_ACTIVITY_II {

    static void feetconvert(double feet) {
	double inches = feet * 12;
	System.out.print("inches = " +inches);
}
	public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	System.out.print("Enter the feet: ");
	double feet = sc.nextDouble();
	feetconvert(feet);
  }
}