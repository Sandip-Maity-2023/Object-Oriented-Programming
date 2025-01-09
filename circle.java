class ex{
    double r;
    void get(double a){
        r=a;
    }
    void area(){
        double a=3.14*r*r;
        System.out.println("area="+a);
    }
    void peri(){
        double p=2*3.14*r;
        System.out.println("Perimeter:"+p);
    }
}
public class circle {
    public static void main(String[] args) {
        ex x=new ex();
        x.get(8.5);
        x.area();
        x.peri();
    }
}
