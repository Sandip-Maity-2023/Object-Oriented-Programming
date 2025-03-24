class AB1 {
    int x;
    void disp(){
        System.out.println("In A class");
        System.out.println("x= "+x);

    }
}
class B1 extends AB1{
int y;
void disp2(){
    System.out.println("In B class");
    System.out.println("x= "+x);
    System.out.println("y= "+y);

    disp();
}
}
class C1 extends B1{
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
        C1 p=new C1();
        p.y=20;
        p.x=10;
        p.z=30;
        p.disp();
        p.disp2();
        p.disp3();

    }
}