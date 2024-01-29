import java.util.Scanner;
public class LAPINCAO_ACTIVITY_II{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int fnum = input.nextInt();
       System.out.print("Enter the second number: ");
        int snum = input.nextInt();
        int sum =  fnum + snum;
        System.out.println("The sum is "+sum);
        int dif =  fnum - snum;
        System.out.println("The difference is "+dif);
        int pro =  fnum * snum;
        System.out.println("The product is "+pro);
        int qou =  fnum / snum;
        System.out.println("The quotient is "+qou);
    }
}