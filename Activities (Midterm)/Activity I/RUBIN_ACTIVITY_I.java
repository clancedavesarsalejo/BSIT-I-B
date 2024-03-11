import java.util.Scanner;
    public class RUBIN_ACTIVITY_I {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
           
            String [] names = new String[5];

            for(int i = 0; i < names.length; i++){
                System.out.print("Enter name " + (i + 1) + ": ");
                names[i] = sc.nextLine();
            }
           
            System.out.print("Enter the number: ");
            int index = sc.nextInt();

            if (index >= 1 && index <= names.length){
                System.out.print("You have selected " + names[index - 1] + "<3");
            } else{
                System.out.print("Invalid index");
            }
          }
         }
