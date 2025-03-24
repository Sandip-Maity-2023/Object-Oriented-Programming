interface Aq{
    void disA();
}
interface Bq{
    void disB();
}
class Cq{
    void disC(){
        System.out.println("In C class");
    }
}
class D extends Cq implements Aq,Bq {
    public void disA(){
System.out.println("For A interface");
    }
    public void disB(){
        System.out.println("For B interface");
            }
           void disC(){
        System.out.println("For C class");
                    }
    void disD(){
        System.out.println("For D class");
    }
    
}
public class interface_example {
    public static void main(String[] args) {
        D x=new D();
        x.disA();
        x.disB();
        x.disC();
        x.disD();
    }
}