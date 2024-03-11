   import java.util.Scanner;
   public class PESCUELA_ACTIVITY_III{
        public static void main(String[] args){
            Scanner sc = new Scanner(System.in);
            int [][] scores = new int[5][5];
            for(int x = 0; x  < scores.length; x++){
                for(int y = 0; y  < scores[x].length; y++){
                    System.out.print("Enter the column "+(x+1)+ " of row " + (y+1) + ": ");
                    scores[x][y] = sc.nextInt();
   
                }
                for (int x = 0; x < scores.length; x++) {
                    int sum = 0;
                    for (int y = 0; y < scores[x].length; y++) {
                        sum += scores[x][y];
                    }
                    double average = (double) sum / scores[x].length;
                    System.out.println("Average score for row " + (x + 1) + ": " + average);
                }
            }
        }