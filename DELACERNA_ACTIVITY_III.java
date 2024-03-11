import java.util.Scanner;

public class DELACERNA_ACTIVITY_III {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        double[][] scores = new double[5][5];

        
        System.out.println("Enter the scores:");

        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print("Enter score for row " + (i + 1) + ", column " + (j + 1) + ": ");
                scores[i][j] = scanner.nextDouble();
            }
        }

        
        scanner.close();

        
        double sum = 0;
        int count = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                sum += scores[i][j];
                count++;
            }
        }

        
        double average = sum / count;

        
        System.out.println("Average score: " + average);
    }
}
