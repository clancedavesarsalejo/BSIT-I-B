import java.util.Scanner;
public class BOYLES_ACTIVITY_I {
    public static void main(String args[]) 
    {   
       
      Scanner s= new Scanner(System.in);
        
         System.out.println("Enter the width of the Triangle:");
         int b= s.nextInt();
 
         System.out.println("Enter the length of the Triangle:");
          int l= s.nextInt();
 
                  //Area = (width*length)
      int area=(b*l);
      System.out.println("Area of Triangle is: " + area);      
   }
}