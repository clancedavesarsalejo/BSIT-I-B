import java.util.Scanner;

public class LUMANTAO_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    double[][] scores = new double[5][5];

     
        System.out.println("Enter scores (1-25):");

       
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                while (true) {
                    try {
                        System.out.printf("Enter score for student %d, subject %d: ", i + 1, j + 1);
                        double score = scanner.nextDouble();
                        if (score < 1 || score > 25) {
                            System.out.println("Please enter a score between 1 and 25.");
                            continue;
                        }
                        scores[i][j] = score;
                        break;
                    } catch (Exception e) {
                        System.out.println("Invalid input. Please enter a number.");
                        scanner.nextLine(); // consume invalid input
                    }
                }
            }
        }

        
        double total = 0;
        int count = 0;
        for (double[] row : scores) {
            for (double score : row) {
                total += score;
                count++;
            }
        }
        double average = total / count;

        
        System.out.println("Average score: " + average);

        scanner.close();
    }
}