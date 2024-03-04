import java.util.Scanner;
public class REBIAS_ACTIVITY_I {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = new String[5];

        for (int i = 0 ; i < names.length ; i++ ){

            System.out.print("Enter a name: "+(i+1)+" : ");
        names[i] = sc.nextLine();
            
        }
        System.out.print("Please input the number of the list of names you would like to display: ");
        int n = sc.nextInt();
        if(n>= 1 && n <= names.length){
         System.out.println(names[n-1]);
        }else{
            System.out.println("Invalid ");
        }

        }
    }     