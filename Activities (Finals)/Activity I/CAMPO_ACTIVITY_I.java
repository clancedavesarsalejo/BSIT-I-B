import java.util.Scanner;

public class CAMPO_ACTIVITY_I{
public static void main(String[]args){
int length = lengthinpt();
int width = widthinpt();
int area = length * width;
System.out.println("Area is "+ area);
}

  static int lengthinpt(){
Scanner sc=new Scanner(System.in);
System.out.println("Enter length: ");
return sc.nextInt();
}

static int widthinpt(){
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter width: ");
  return sc.nextInt();
}}
