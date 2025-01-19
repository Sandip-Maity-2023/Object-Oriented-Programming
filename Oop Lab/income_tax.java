
import java.util.Scanner;

public class income_tax {
    int income,tax;
    void func(int income){
        if(income<=2500){
tax=0;
        }else if(income >2500) {
            tax=(income-2500)*5/100;
            System.out.println("Tax is:"+tax);
        } else if(income>5000){
            tax=(income-5000)*10/100;
            System.out.println("Tax is:"+tax);
        }else if(income>=10000){
            tax=(income-10000)*50/100;
            System.err.println("Tax is:"+tax);
        }else{
System.out.println("No Tax Required");
        }
    }
}
class tax{
    public static void main(String[] args){
        income_tax x=new income_tax();
        Scanner y=new Scanner(System.in);
        System.out.println("Enter the Income:");
        int n=y.nextInt();
        x.func(n);
        y.close();
    }
}
