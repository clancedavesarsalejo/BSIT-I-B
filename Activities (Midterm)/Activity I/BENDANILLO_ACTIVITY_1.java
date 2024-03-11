import  java.util.Scanner;
public class BENDANILLO_ACTIVITY_1 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);

	String[]names =new String[5];

	for (int i=0; i<names.length;i++ ){
	System.out.println("enter name"+(i+1)+" :");
	names[i]=sc.nextLine();}

	System.out.println("enter number of name to select (1-5):");
	int name=sc.nextInt();

	if (name>=1&&name<=names.length)
	{
	System.out.println("you selected: "+ names[name-1]+".");
	}
	else{
	System.out.println("invalid");
}

}


}