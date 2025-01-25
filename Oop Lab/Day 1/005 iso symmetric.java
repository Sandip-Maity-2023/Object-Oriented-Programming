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
    System.out.println("Perimeter of Isosceles Triangle="+p);
}
void area_equilateral(double l){
    double a=(sqrt(3)/4)*l*l;
    System.out.println("Area of Equilateral Triangle="+a);
}
void Perimeter_equilateral(double l){
    double p=3*l;
    System.out.println("Perimeter of Equilateral Triangle="+p);
}
void area_scalene(double x,double y,double z){
    double s=(x+y+z)/2;
    double a=sqrt(s*(s-x)*(s-y)*(s-z));  //heron's formula
    System.out.println("Area of Scalene Triangle="+a);
}
void Perimeter_scalene(double x,double y,double z){
    double p=x+y+z;
    System.out.println("Perimeter of Scalene Triangle="+p);
}
}
class gx{                                   //in another program class name same with this so causing not showing this program out put
    public static void main(String[] args) {
        triangle x=new triangle();
        x.set(10,20);
        x.area_isosceles();
        x.Perimeter_isosceles();
        x.area_equilateral(10);
        x.Perimeter_equilateral(10);
        x.area_scalene(20,20 ,10);
        x.Perimeter_scalene(10, 20, 30);

  }
}