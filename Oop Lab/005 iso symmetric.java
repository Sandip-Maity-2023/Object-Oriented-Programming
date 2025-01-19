import static java.lang.Math.sqrt;
class triangle {
    private double h,l;
    void set(double l1,double l2){
h=l1;
l=l2;
    }
void area_isosceles(){
    double a=0.5*l*h;
    System.out.println("Area of Isosceles Triangle="+a);
}
void Perimeter_isosceles(){
    double p=2*l+h;
    System.out.println("Area of Isosceles Perimeter="+p);
}
void area_equilateral(double l){
    double a=(sqrt(3)/4)*l*l;
    System.out.println("Area of Equilateral Triangle="+a);
}
}
class gx{                                   //in another program class name same with this so causing not showing this program out put
    public static void main(String[] args) {
        triangle x=new triangle();
        x.set(10,20);
        x.area_isosceles();
        x.Perimeter_isosceles();
        x.area_equilateral(10);
  }
}