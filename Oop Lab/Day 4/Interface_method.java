interface A{
    void disA();
    }
    interface B{
    void disB();
    }
    class C implements A,B{
    public void disA(){  //only void not suitable has to add public
        System.out.println("For A interface");
    }
    public void disB(){
        System.out.println("For B interface");
    }
    void disC(){
        System.out.println("For C interface");
    }
    }
    public class Interface_method {
        public static void main(String[] args) {
            C x=new C();
            x.disA();
            x.disB();
            x.disC();
        }
    }