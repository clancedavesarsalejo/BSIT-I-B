import java.util.Scanner;

public class GONZALES_ACTIVITY_I{
public static void main(String[]args){
int length = lengthinput();
int width = widthinput();
int area = length * width;
System.out.println("Area is "+ area);
}

  static int lengthinput(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length: ");
return sc.nextInt();
}

static int widthinput(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter width: ");
  return sc.nextInt();
}}
