import java.util.Scanner;

public class average {
public static void main(String[] args) {
    Scanner scan=new Scanner(System.in);

  System.out.println("Enter the 1st  num:");             
  double num1=scan.nextDouble();

  System.out.println("Enter 2nd number:");             
  double num2=scan.nextDouble();                            

  System.out.print("Enter 3rd number:");                           
double num3=scan.nextDouble();
scan.close();

System.out.println("The average of numbers:"+avr(num1,num2,num3));
}
public static double avr(double a,double b,double c) {
return (a+b+c)/3;    
}
}
  
