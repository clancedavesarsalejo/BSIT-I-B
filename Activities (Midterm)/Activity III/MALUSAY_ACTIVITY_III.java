import java.util.Scanner;
    public class MALUSAY_ACTIVITY_III {
        public static void main(String[] args) {
            Scanner sr = new Scanner (System.in);

    final int rows = 5;
    final int cols = 5;

    int[][] scores = new int[rows][cols];
    Scanner scanner = new Scanner(System.in);


    System.out.println("Enter scores for 5 students:");
    for (int i = 0; i < rows; i++) {
        System.out.println("Enter scores for student " + (i + 1) + ": ");
        for (int j = 0; j < cols; j++) {
            scores[i][j] = scanner.nextInt();
        }
    }

    int sum = 0;
    int count = 0;
    for (int i = 0; i < rows; i++) {
        for (int j = 0; j < cols; j++) {
            sum += scores[i][j];
            count++;
        }
    }
    double average = (double) sum / count;

    System.out.println("Average of all scores: " + average);
    scanner.close();
}
}






   
