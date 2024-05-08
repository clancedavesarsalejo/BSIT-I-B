import java.util.Scanner;
     public class PONO_ACTIVITY_VI {

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            System.out.print("Enter your timer: ");
            int time = input.nextInt();

            while(time>=0){
                System.out.println(time);
                time--;
            }

        }

    }
        