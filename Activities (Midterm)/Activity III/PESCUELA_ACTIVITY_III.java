import java.util.Scanner;
public class PESCUELA_ACTIVITY_III{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

		int rows = 5;
		int columns = 5;
		int[][] scores = new int[rows][columns];
        
		for (int x = 0; x < rows; x++) {
		    for (int y = 0; y < columns; y++) {
		    System.out.print("Enter score : ");
		    scores[x][y] = sc.nextInt();
		    }
	    }
		int sum = 0;
		for (int x = 0; x < rows; x++) {
		    for (int y = 0; y < columns; y++) {
		    sum += scores[x][y];
		    }
	    }

		double average = (double) sum / (rows * columns);
		System.out.println("Average = " + average);
    }
}
