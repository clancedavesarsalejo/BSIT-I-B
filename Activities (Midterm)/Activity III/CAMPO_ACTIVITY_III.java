import java.util.Scanner;
public class CAMPO_ACTIVITY_III{
	public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);

		int rows = 5;
		int columns = 5;
		int[][] scores = new int[rows][columns];

		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
		System.out.print("Enter score at [" + i + "][" + j + "]: ");
		scores[i][j] = sc.nextInt();
	}}

		int sum = 0;
		for (int i = 0; i < rows; i++) {
		for (int j = 0; j < columns; j++) {
		sum += scores[i][j];
	}}

		double average = (double) sum / (rows * columns);
		System.out.println("Average = " + average);

}}
