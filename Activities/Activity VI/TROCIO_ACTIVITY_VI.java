import java.util.Scanner;
public class TROCIO_ACTIVITY_VI {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of time seconds: ");
        int time;
        time = sc.nextInt();
        while(time >=0){
        System.out.println(time);
        time--;
        }
    }
}