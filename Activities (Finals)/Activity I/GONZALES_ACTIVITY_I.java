import java.util.Scanner;
class GONZALES_ACTIVITY_I {
    
  public int addNumbers(int width, int length ) {
    int product = width * length;
    
    return product;
  }

  public static void main(String[] args) {
    
    int num1 = 10;
    int num2 = 20;

  
    GONZALES_ACTIVITY_I obj = new GONZALES_ACTIVITY_I();
   
    int result = obj.addNumbers(num1, num2);
    System.out.println("Area is: " + result);
  }
}