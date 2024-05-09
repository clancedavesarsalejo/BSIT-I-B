import java.util.Scanner;
public class LIM_ACTIVITY_I {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    String[] name = new String[5];

    for(int i=0;i<5;i++){
      System.out.print("Enter Complete names " + (i + 1) + ": ");
      name[i] = sc.nextLine();
    }
   System.out.print("Enter a number: "); 
   int num = sc.nextInt();
   
   if(num >= 1 && num <= name.length){
    System.out.println(name[num - 1]);
   }else{
    System.out.println("Invalid");
   }
    
    sc.close();
  }
}
