abstract class A13{
    abstract void display();
    /*
    {
        System.out.println("gdfh");
    }
    */
}
class B11 extends A13{
void display(){
    System.out.println("In B class");
}
}
public class abstraction1{
public static void main(String[] args) {

    //dynamic method dispatch
    A13 x;
    x=new B11();
    x.display();
}
}