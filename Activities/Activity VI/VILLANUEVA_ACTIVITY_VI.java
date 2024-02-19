import java.util.Scanner;
    public class VILLANUEVA_ACTIVITY_VI {
        public static void main(String[] args){
            Scanner input = new Scanner(System.in);
        
        System.out.println("Enter time (in seconds): ");
        int time = input.nextInt();

        while (time>=0) {
            System.out.println(time);
            time --;
        }
    }
}