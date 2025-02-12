abstract class A{
    abstract void display();
    /*
    {
        System.out.println("gdfh");
    }
    */
}
class B extends A{
void display(){
    System.out.println("In B class");
}
}
public class abstraction1{
public static void main(String[] args) {

    //dynamic method dispatch
    A x;
    x=new B();
    x.display();
}
}