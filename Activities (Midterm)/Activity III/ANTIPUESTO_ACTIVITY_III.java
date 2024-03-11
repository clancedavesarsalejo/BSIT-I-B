import java.util.Scanner;
public class ANTIPUESTO_ACTIVITY_III {
 public static void main (String []args){
    Scanner sr = new Scanner (System.in);

    final int ROWS = 5;
    final int COLS = 5;

    int[][] scores = new int[ROWS][COLS];
    Scanner scanner = new Scanner(System.in);

    // Input scores
    System.out.println("Enter scores for 5 students:");
    for (int i = 0; i < ROWS; i++) {
        System.out.println("Enter scores for student " + (i + 1) + ": ");
        for (int j = 0; j < COLS; j++) {
            scores[i][j] = scanner.nextInt();
        }
    }

    
    int sum = 0;
    int count = 0;
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
            sum += scores[i][j];
            count++;
        }
    }
    double average = (double) sum / count;

    
    System.out.println("Average of all scores: " + average);

    
    scanner.close();
}
}

