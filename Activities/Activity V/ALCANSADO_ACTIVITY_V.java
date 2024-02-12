import java.util.Scanner;

    public class ALCANSADO_ACTIVITY_V{
     public static void main (String []args){
        Scanner sc = new Scanner (System.in);
        System.out.print(s:"Enter ur age:");
        int age = sc.nextln();
        
        if(age<64 && age >18){
            System.out.println(x:"ADULT");
        else if (age<=17 && age >=12 ){
            System.out.print(x:"TEEN");
            else{
                System.out.println(x:"CHILD");
            }
        }
    }

        




    




