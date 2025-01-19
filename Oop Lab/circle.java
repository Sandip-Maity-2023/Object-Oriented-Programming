class find{
    double r;
    void get(double a){
        r=a;
    }
    void area(){
        double a=3.14*r*r;
        System.out.println("Area of Circle="+a);
    }
    void peri(){
        double p=2*3.14*r;
        System.out.println("Perimeter of Circle:"+p);
    }
    void area(double a,double b){
        double a1=a*b;
        System.out.println("Area of Rectangle="+a1);
}
void peri(double a,double b){
    double p1=2*(a+b);
    System.out.println("Perimeter of Rectangle="+p1);
}
}
class circle{
    public static void main(String[] args) {
        find y=new find();
        y.get(8.5);
        y.area();
        y.peri();
        y.area(5.5,9.2);
        y.peri(10,20);
    }
}

