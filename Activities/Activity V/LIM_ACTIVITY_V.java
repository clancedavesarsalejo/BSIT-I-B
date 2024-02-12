import java.util.Scanner;

public class LIM_ACTIVITY_V {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your age: ");
        int age = sc.nextInt();

        if(age>=0 && age <=11 ){
            System.out.print("Child ");
        } else if (age>=12 && age <=17){
            System.out.print(" Teen ");
        } else if (age>18 && age <=64){
            System.out.print("Adult");
        }
    }

}
