import java.util.Scanner;
public class SUMONOD_ACTIVITY_III {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);

    int[][] average = new int[5][5];

    for(int x = 0;x < 5; x++){
      for(int y = 0;y < 5; y++){
        System.out.print("Enter Value " + (x + 1) + ": ");
        average[x][y] = sc.nextInt();
      }
    }
    double sum = 0;
    int totalScore = average.length * average.length;
    for(int i = 0;i < average.length; i++){
      for(int o = 0;o < average[i].length; o++){
        sum += average[i][o];
      }
    }
    System.out.println(sum / totalScore);

    sc.close();
  }
}
