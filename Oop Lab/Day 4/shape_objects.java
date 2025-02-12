abstract class shape{
    double x=3,y=3;  //it will not affect
    //System.out.println("Area of Triangle: "+x3.area()+" unit square");
abstract double area();
}
class rect extends shape{
    double a,b;
    rect(double x,double y){
       x=a;
       y=b;
    }
    double area(){
        return x*y;
    }
}
class cir extends shape{
    double r;
    cir(double r){
        this.r=r;
    }
    double area(){
        return Math.PI*r*r;
    }
}
class tri extends shape{
    double l,w;
    tri(double p,double q){
        l=p;
        w=q;
    }
    double area(){
        return 0.5*l*w;
    }
}
public class shape_objects {
    public static void main(String[] args) {
        
    rect x1=new rect(10.5,14.6);
    System.out.println("Area of Rectangle: "+x1.area()+" unit square");

    cir x2=new cir(12.6);
    System.out.println("Area of circle: "+x2.area()+" unit square");

    tri x3=new tri(4.5,8.7);
    System.out.println("Area of Triangle: "+x3.area()+" unit square");

}
}