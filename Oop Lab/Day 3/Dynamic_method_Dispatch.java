// A Java program to illustrate Dynamic Method
// Dispatch using hierarchical inheritance
class A1
{
    void m1()
    {
        System.out.println("Inside A's m1 method");
    }
}

class B0 extends A1
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside B's m1 method");
    }
}

class C0 extends A1
{
    // overriding m1()
    void m1()
    {
        System.out.println("Inside C's m1 method");
    }
}

// Driver class
public class Dynamic_method_Dispatch
{
    public static void main(String args[])
    {
        A1 a = new A1();

        B0 b = new B0();

        // object of type C
        C0 c = new C0();

        // obtain a reference of type A
        A1 ref;
        
        // ref refers to an A object
        ref = a;

        // calling A's version of m1()
        ref.m1();

        // now ref refers to a B object
        ref = b;

        // calling B's version of m1()
        ref.m1();

        // now ref refers to a C object
        ref = c;

        // calling C's version of m1()
        ref.m1();
    }
}