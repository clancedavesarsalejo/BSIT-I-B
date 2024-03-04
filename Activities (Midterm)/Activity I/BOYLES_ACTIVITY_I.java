import java.util.Scanner;
    public class BOYLES_ACTIVITY_I{
    public static void main(String []args){
        Scanner S = new Scanner(System.in);

        String [] names = new String[5];

    for(int i=0;i< names.length; i++){
        System.out.print("Enter Name"+(i+1)+": ");
        names[i] = S.nextLine();
    }

    System.out.print("Enter number of list of names: ");
    int index = S.nextInt();

    if (index >= 1 && index <= names.length) {
        System.out.println("You have Selected: " + names[index - 1]+ ".");
    }else {
        System.out.println("Invalid index");
    
    }
    }

}