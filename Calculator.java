import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);

        System.out.println("Simple Calculator");
        System.out.println("1. Addition(+)");
        System.out.println("2. Subtraction(-)");
        System.out.println("3. Multiplication(*)");     
        System.out.println("4. Division(/)");
        System.out.println("Enter your choice: ");
        int choice=x.nextInt();

        System.out.println("Enter first number: ");
        int a=x.nextInt();
        System.out.println("Enter second number: ");
        int b=x.nextInt();
while(choice !=5){
        switch(choice){
            case 1:
                System.out.println("Addition: "+(a+b));
                break;
            case 2:
                System.out.println("Subtraction: "+(a-b));
                break;
            case 3:
                System.out.println("Multiplication: "+(a*b));
                break;
            case 4:
                if(b!=0){
                    System.out.println("Division: "+(a/b));
                }else{
                    System.out.println("Not divisible");
                }
                break;
            case 5:
                System.out.println("Exit");
                break;
            default:
                System.out.println("Invalid choice");
        }
}
x.close();
}
}