import java.util.Scanner;

public class ACAYLAR_ACTIVITY_III {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[][] scores = {
            { 1, 2, 3, 4, 5 },
            { 6, 7, 8, 9, 10 },
            { 11, 12, 13, 14, 15 },
            { 16, 17, 18, 19, 20 },
            { 21, 22, 23, 24, 25 }
        };

        int sum = 0;

       
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores[i].length; j++) {
                System.out.println("Score at position (" + i + "," + j + ") is " + scores[i][j]);
                sum += scores[i][j];
            }
        }

        System.out.println("Sum of all scores: " + sum);

        double average = (double) sum / (scores.length * scores[0].length);
        System.out.println("Average of all scores: " + average);

        sc.close(); 
    }
}
