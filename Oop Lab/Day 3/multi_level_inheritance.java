class A {
    int x;
    void disp(){
        System.out.println("In A class");
        System.out.println("x= "+x);

    }
}
class B extends A{
int y;
void disp2(){
    System.out.println("In B class");
    System.out.println("x= "+x);
    System.out.println("y= "+y);

    disp();
}
}
class C extends B{
    int z;
    void disp3(){
        System.out.println("In C class");
        System.out.println("x= "+x);
        System.out.println("y= "+y);
        System.out.println("z= "+z);

        disp();
        disp2();
    }
}
public class multi_level_inheritance{
    public static void main(String[] args) {       
        C p=new C();
        p.y=20;
        p.x=10;
        p.z=30;
        p.disp();
        p.disp2();
        p.disp3();

    }
}