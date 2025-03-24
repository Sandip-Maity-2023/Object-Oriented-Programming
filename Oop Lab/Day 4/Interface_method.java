interface A0{
    void disA();
    }
    interface B01{
    void disB();
    }
    class C01 implements A0,B01{
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
            C01 x=new C01();
            x.disA();
            x.disB();
            x.disC();
        }
    }