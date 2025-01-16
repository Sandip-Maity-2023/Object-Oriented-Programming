public class Triangle {
    double l,h;

    void tri(double l,double h){
this.l=l;
this.h=h;
double y=0.5*this.l*this.h;
System.out.println("Area of Triangle:"+y);
    }
    void tri(double l){
        this.l=l;
        double y=(Math.sqrt(3)/4)*this.l*this.l;
        System.out.println("Area of Equilateral Triangle:"+y);
    }
public static void main(String[] args) {
    Triangle x=new Triangle();
    x.tri(10.5);
    x.tri(5.5,6.5);
}
}
